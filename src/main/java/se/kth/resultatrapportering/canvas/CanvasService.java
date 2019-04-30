package se.kth.resultatrapportering.canvas;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import se.kth.resultatrapportering.ResultatrapporteringProperties;
import se.kth.resultatrapportering.canvas.model.Assignment;
import se.kth.resultatrapportering.canvas.model.Course;
import se.kth.resultatrapportering.canvas.model.CustomData;
import se.kth.resultatrapportering.canvas.model.Submission;
import se.kth.resultatrapportering.canvas.model.User;

@Service
public class CanvasService {

  private final ObjectMapper mapper;
  private final ResultatrapporteringProperties props;
  private final DefaultUriBuilderFactory builderFactory;
  private final WebClient webClient;

  public CanvasService(ObjectMapper mapper, ResultatrapporteringProperties props) throws IOException {
    this.mapper = mapper;
    this.props = props;
    this.builderFactory = new DefaultUriBuilderFactory(props.getCanvasBaseUrl());
    this.webClient = createWebClient(props);
  }

  private WebClient createWebClient(ResultatrapporteringProperties props) throws IOException {

    ExchangeStrategies strategies = ExchangeStrategies
        .builder()
        .codecs(clientDefaultCodecsConfigurer -> {
          clientDefaultCodecsConfigurer.defaultCodecs().jackson2JsonEncoder(
              new Jackson2JsonEncoder(mapper, MediaType.APPLICATION_JSON));
          clientDefaultCodecsConfigurer.defaultCodecs().jackson2JsonDecoder(
              new Jackson2JsonDecoder(mapper, MediaType.APPLICATION_JSON));
        }).build();

    SslContext sslContext = SslContextBuilder
        .forClient()
        .trustManager(InsecureTrustManagerFactory.INSTANCE)
        .build();

    final HttpClient httpClient = HttpClient.create()
        .secure(spec -> spec.sslContext(sslContext));

    final WebClient webClient = WebClient.builder()
        .exchangeStrategies(strategies)
        .clientConnector(new ReactorClientHttpConnector(httpClient))
        .defaultHeader("Authorization", "Bearer " + props.getCanvasToken())
        .defaultHeader("Accept", MediaType.APPLICATION_JSON.toString())
        .defaultHeader("Content-Type", MediaType.APPLICATION_JSON.toString())
        //.filter(logRequest())
        .build();

    return webClient;
  }

  public List<Assignment> findAssignmentsForCourse(int canvasCourseId) {

    URI assignments = this.builderFactory.builder()
        .path("api/v1/courses/{courseId}/assignments")
        .queryParam("per_page", "500")
        .build(canvasCourseId);

    final Assignment[] assignmentArray = this.webClient.get()
        .uri(assignments)
        .retrieve()
        .bodyToMono(Assignment[].class)
        .block();

    return Lists.newArrayList(assignmentArray);
  }

  public List<Submission> findSubmissionsForAssignment(int canvasCourseId, int canvasAssignmentId) {

    URI submissions = this.builderFactory.builder()
        .path("/api/v1/courses/{courseId}/assignments/{assignmentId}/submissions")
        .queryParam("per_page", "500")
        .build(canvasCourseId, canvasAssignmentId);

    final Submission[] submissionArray = this.webClient.get()
        .uri(submissions)
        .retrieve()
        .bodyToMono(Submission[].class)
        .block();

    return Lists.newArrayList(submissionArray);
  }

  public List<Submission> findSubmissionsForCourse(int canvasCourseId) {

    URI submissions = this.builderFactory.builder()
        .path("/api/v1/courses/{courseId}/students/submissions")
        .queryParam("per_page", "500")
        .build(canvasCourseId);

    final Submission[] submissionArray = this.webClient.get()
        .uri(submissions)
        .retrieve()
        .bodyToMono(Submission[].class)
        .block();

    return Lists.newArrayList(submissionArray);
  }

  public String getLadokUidForStudent(int canvasStudentId) {

    URI studentCustomData = this.builderFactory.builder()
        .path("/api/v1/users/{studentId}/custom_data/ladok_uid")
        .queryParam("ns", "se.kth")
        .build(canvasStudentId);

    final CustomData customData = this.webClient.get()
        .uri(studentCustomData)
        .retrieve()
        .bodyToMono(CustomData.class)
        .block();

    return customData.getData();
  }

  public List<User> findStudentsForCourse(int canvasCourseId) {

    URI students = this.builderFactory.builder()
        .path("/api/v1/courses/{courseId}/users")
        .queryParam("enrollment_type[]", "student")
        .queryParam("per_page", "500")
        .build(canvasCourseId);

    final User[] userArray = this.webClient.get()
        .uri(students)
        .retrieve()
        .bodyToMono(User[].class)
        .block();

    return Lists.newArrayList(userArray);
  }

  public Mono<Course> findCourse(int canvasCourseId) {

    URI course = this.builderFactory.builder()
        .path("/api/v1/courses/{courseId}")
        .build(canvasCourseId);

    return this.webClient.get()
        .uri(course)
        .retrieve()
        .bodyToMono(Course.class);
  }
}
