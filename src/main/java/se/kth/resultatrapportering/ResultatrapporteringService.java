package se.kth.resultatrapportering;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;
import se.kth.resultatrapportering.canvas.CanvasService;
import se.kth.resultatrapportering.canvas.model.Assignment;
import se.kth.resultatrapportering.canvas.model.Course;
import se.kth.resultatrapportering.canvas.model.Submission;
import se.kth.resultatrapportering.canvas.model.User;
import se.kth.resultatrapportering.ladok.LadokService;
import se.kth.resultatrapportering.ladok.model.Arbetsunderlag;
import se.kth.resultatrapportering.ladok.model.Betyg;
import se.kth.resultatrapportering.ladok.model.Betygskala;
import se.kth.resultatrapportering.ladok.model.Filtrera;
import se.kth.resultatrapportering.ladok.model.Resultat;
import se.kth.resultatrapportering.ladok.model.Studieresultat;

@Service
@RequiredArgsConstructor
public class ResultatrapporteringService {

  private final CanvasService canvas;
  private final LadokService ladok;

  public void exportCanvasCourseGradesToLadokBetyg(int canvasCourseId) {

    Map<Integer, Betygskala> betygskalaMap = Maps.newHashMap();

    Course course = canvas.findCourse(canvasCourseId).block();

    List<User> canvasStudents = canvas.findStudentsForCourse(canvasCourseId);
    List<Assignment> canvasAssignments = canvas.findAssignmentsForCourse(canvasCourseId);

    final Map<String, User> studentsMap = canvasStudents.parallelStream()
        .collect(Collectors.toMap(s -> canvas.getLadokUidForStudent(s.getId()), s -> s));

    Filtrera filter = new Filtrera();
    filter.setKurstillfallenUID(Lists.newArrayList(course.getIntegrationId()));
    filter.setFiltrering(Lists.newArrayList("OBEHANDLADE", "UTKAST"));
    filter.setOrderBy(Lists.newArrayList( "EFTERNAMN_ASC", "FORNAMN_ASC", "PERSONNUMMER_ASC"));
    filter.setPage(1);
    filter.setLimit(500);

    for (Assignment assignment : canvasAssignments) {

      List<Submission> canvasSubmissions = canvas.findSubmissionsForAssignment(canvasCourseId, assignment.getId());

      if (assignment.getIntegrationId() == null ||  canvasSubmissions.size() == 0) {
        continue;
      }

      Studieresultat studieresultat =
          ladok.resultat.findStudieresultat(assignment.getIntegrationId(), filter);

      List<Arbetsunderlag> resultatBetygExisterar = studieresultat.getResultat().stream()
          .flatMap(r -> r.getResultatPaUtbildningar().stream())
          .filter(rpu -> rpu.getArbetsunderlag() != null && rpu.getArbetsunderlag().getProcessStatus().equals(1))
          .map(rpu -> rpu.getArbetsunderlag())
          .collect(Collectors.toList());


      resultatBetygExisterar.parallelStream()
          .forEach(arbetsunderlag -> ladok.resultat.deleteStudieresultat(arbetsunderlag.getUid()));

      for (String ladokStudentUid : studentsMap.keySet()) {

        User canvasStudent = studentsMap.get(ladokStudentUid);

        Submission canvasSubmission = Iterables.find(canvasSubmissions,
            sub -> sub.getUserId().equals(canvasStudent.getId()), null);

        if (canvasSubmission == null || canvasSubmission.getGrade() == null) {
          continue;
        }

        Resultat ladokResultat = Iterables.find(studieresultat.getResultat(),
            res -> ladokStudentUid.equals(res.getStudent().getUid()));

        if (!betygskalaMap.containsKey(ladokResultat.getRapporteringskontext().getBetygsskalaID())) {
          betygskalaMap.put(
              ladokResultat.getRapporteringskontext().getBetygsskalaID(),
              ladok.resultat.findBetygskala(ladokResultat.getRapporteringskontext().getBetygsskalaID()));
        }
        Betygskala betygskala = betygskalaMap.get(ladokResultat.getRapporteringskontext().getBetygsskalaID());
        Optional<Integer> betygsgrad = gradeToBetygsgrad(betygskala, canvasSubmission.getGrade());

        Betyg betyg = new Betyg();
        betyg.setUid(ladokStudentUid);
        betyg.setBetygsgrad(betygsgrad.get());
        betyg.setBetygsskalaID(betygskala.getID());
        betyg.setExaminationsdatum(canvasSubmission.getGradedAt().substring(0, 10));

        ladok.resultat.createStudieresultat(ladokResultat.getUid(), assignment.getIntegrationId(), betyg);
      }
    }
  }

  private Optional<Integer> gradeToBetygsgrad(Betygskala betygskala, String grade) {
    return betygskala.getBetygsgrad().stream()
        .filter(b -> grade.equals(b.getKod()))
        .map(g -> g.getID())
        .findFirst();
  }
}
