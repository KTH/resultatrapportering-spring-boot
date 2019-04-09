package se.kth.resultatrapportering.canvas;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.io.IOException;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.netty.http.client.HttpClient;
import se.kth.resultatrapportering.ResultatrapporteringProperties;
import se.kth.resultatrapportering.canvas.model.GradeChanges;

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

    SslContext sslContext = SslContextBuilder
        .forClient()
        .trustManager(InsecureTrustManagerFactory.INSTANCE)
        .build();

    final HttpClient httpClient = HttpClient.create()
        .secure(spec -> spec.sslContext(sslContext));

    final WebClient webClient = WebClient.builder()
        .clientConnector(new ReactorClientHttpConnector(httpClient))
        .defaultHeader("Authorization", "Bearer " + props.getCanvasToken())
        .defaultHeader("Accept", MediaType.APPLICATION_JSON.toString())
        .defaultHeader("Content-Type", MediaType.APPLICATION_JSON.toString())
        //.filter(logRequest())
        .build();

    return webClient;
  }

  public GradeChanges findGradeChangeForCourse(int canvasCourseId) {

    URI studiedeltagare = this.builderFactory.builder()
        .path("api/v1/audit/grade_change/courses/{courseId}")
        .build(canvasCourseId);

    return this.webClient.get()
        .uri(studiedeltagare)
        .retrieve()
        .bodyToMono(GradeChanges.class)
        .block();
  }
}
