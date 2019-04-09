package se.kth.resultatrapportering;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import java.net.URI;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;
import se.kth.resultatrapportering.canvas.CanvasService;
import se.kth.resultatrapportering.canvas.model.Event;
import se.kth.resultatrapportering.canvas.model.GradeChanges;
import se.kth.resultatrapportering.ladok.LadokService;
import se.kth.resultatrapportering.ladok.model.Betyg;
import se.kth.resultatrapportering.ladok.model.Filtrera;

@SpringBootApplication
@RequiredArgsConstructor
public class ResultatrapporteringApplication implements CommandLineRunner {

  private final ObjectMapper mapper;
  private final CanvasService canvas;
  private final LadokService ladok;

  public static void main(String[] args) {
    SpringApplication.run(ResultatrapporteringApplication.class, args);
  }

  @Override
  public void run(String... args) throws JsonProcessingException {

    if (args.length != 1) {
      System.err.println("Usage: java -jar resultatrapportering.jar [canvasCourseId]");
      System.exit(1);
    }

//    String module = "dff337ca-9aef-11e8-9cbb-1012b1a242f7";
//    String kurstillfalleUID = "66c31075-73d8-11e8-b4e0-063f9afb40e3";

    final GradeChanges gradeChanges = canvas.findGradeChangeForCourse(Integer.valueOf(args[0]));
    getLatestCanvasEvents(gradeChanges.getEvents());

    String kurstillfalleUID =args[0];
    String module = args[1];

    Filtrera filter = new Filtrera();
    filter.setKurstillfallenUID(Lists.newArrayList(module));
    filter.setFiltrering(Lists.newArrayList("OBEHANDLADE", "UTKAST"));
    //filter.setUtbildningsinstansUID("66bf18cd-73d8-11e8-b4e0-063f9afb40e3");
    filter.setOrderBy(Lists.newArrayList( "EFTERNAMN_ASC", "FORNAMN_ASC", "PERSONNUMMER_ASC"));
    filter.setPage(1);
    filter.setLimit(500);


    String result = ladok.resultat.findStudieresultat(kurstillfalleUID, filter);
    System.out.println(result);

    DocumentContext jsonContext = JsonPath.parse(result);
    List<String> studentUidList = jsonContext.read("$.Resultat[*].Student.Uid");
    List<String> studieresultatUidList = jsonContext.read("$.Resultat[*].Uid");
    List<Integer> betygskalaIdList = jsonContext.read("$.Resultat[*].Rapporteringskontext.BetygsskalaID");
    List<String> resultatUidBetygExisterar = jsonContext.read("$..Arbetsunderlag[?(@.ProcessStatus == 1)].Uid");

    for (String resultatUid : resultatUidBetygExisterar) {
      System.out.println(resultatUid);
      ladok.resultat.deleteStudieresultat(resultatUid);
    }

    for (int i = 6; i < 8; i++) {
      Betyg betyg = new Betyg();
      betyg.setUid(studentUidList.get(i));
      betyg.setBetygsgrad(131673);
      betyg.setBetygsskalaID(betygskalaIdList.get(i));
      betyg.setExaminationsdatum("2019-04-07");

      System.out.println(mapper.writeValueAsString(betyg));

      String res2 = ladok.resultat.createStudieresultat(studieresultatUidList.get(i), kurstillfalleUID, betyg);
      System.out.println(res2);
    }
  }

  private List<Event> getLatestCanvasEvents(List<Event> events) {
    return events;
  }
}
