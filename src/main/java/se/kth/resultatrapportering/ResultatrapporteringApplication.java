package se.kth.resultatrapportering;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.KeyManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import se.kth.ladok.Betyg;
import se.kth.ladok.Filtrera;

@SpringBootApplication
public class ResultatrapporteringApplication implements CommandLineRunner {

  @Autowired
  private WebClient webClient;

  @Autowired
  private ObjectMapper mapper;

  public static void main(String[] args) {
    SpringApplication.run(ResultatrapporteringApplication.class, args);
  }

  @Override
  public void run(String... args) throws JsonProcessingException {

    if (args.length != 2) {
      System.err.println("Usage: java -jar resultatrapportering.jar [kurstillfalleUid] [modulUid]");
      System.exit(1);
    }

//    String module = "dff337ca-9aef-11e8-9cbb-1012b1a242f7";
//    String kurstillfalleUID = "66c31075-73d8-11e8-b4e0-063f9afb40e3";

    String kurstillfalleUID =args[0];
    String module = args[1];

    DefaultUriBuilderFactory builderFactory = new DefaultUriBuilderFactory("https://api.test.ladok.se");

    Filtrera filter = new Filtrera();
    filter.setKurstillfallenUID(Lists.newArrayList(module));
    filter.setFiltrering(Lists.newArrayList("OBEHANDLADE", "UTKAST"));
    filter.setUtbildningsinstansUID("66bf18cd-73d8-11e8-b4e0-063f9afb40e3");
    filter.setOrderBy(Lists.newArrayList( "EFTERNAMN_ASC", "FORNAMN_ASC", "PERSONNUMMER_ASC"));
    filter.setPage(1);
    filter.setLimit(500);

    URI studiedeltagare = builderFactory.builder()
        .path("/resultat/studieresultat/rapportera/utbildningsinstans/{kurstillfalleUID}/sok")
        .build(kurstillfalleUID);


    Mono<String> result = this.webClient.put()
        .uri(studiedeltagare)
        .contentType(MediaType.parseMediaType("application/vnd.ladok-resultat+json"))
        .header("Accept", "application/vnd.ladok-resultat+json")
        .syncBody(filter)
        .retrieve()
        .bodyToMono(String.class);

    System.out.println(result.block());

    DocumentContext jsonContext = JsonPath.parse(result.block());
    List<String> studentUidList = jsonContext.read("$.Resultat[*].Student.Uid");
    List<String> studieresultatUidList = jsonContext.read("$.Resultat[*].ResultatPaUtbildningar[0].Arbetsunderlag.StudieresultatUID");
    List<Integer> betygskalaIdList = jsonContext.read("$.Resultat[*].Rapporteringskontext.BetygsskalaID");

    List<String> studieresultatUidBetygExisterar = jsonContext.read("$..Arbetsunderlag[?(@.ProcessStatus == 1)].Uid");

    for (String delete : studieresultatUidBetygExisterar) {
      System.out.println(delete);
    }

    for (String delete : studieresultatUidBetygExisterar) {

      URI deletebetyg = builderFactory.builder()
          .path("/resultat/studieresultat/resultat/{resultatId}")
          .build(delete);

      this.webClient.delete()
          .uri(deletebetyg)
          .header("Accept", "application/vnd.ladok-resultat+json")
          .retrieve()
          .bodyToMono(Void.class)
          .block();
    }

    for (int i = 6; i < 8; i++) {
      Betyg betyg = new Betyg();
      betyg.setUid(studentUidList.get(i));
      betyg.setBetygsgrad(131673);
      betyg.setBetygsskalaID(betygskalaIdList.get(i));
      betyg.setExaminationsdatum("2019-04-07");

      System.out.println(mapper.writeValueAsString(betyg));

      URI postbetyg = builderFactory.builder()
          .path("/resultat/studieresultat/{studieresultatUid}/utbildning/{kurstillfalleUID}/resultat")
          .build(studieresultatUidList.get(i), kurstillfalleUID);

      Mono<String> result2 = this.webClient.post()
          .uri(postbetyg)
          .contentType(MediaType.parseMediaType("application/vnd.ladok-resultat+json"))
          .header("Accept", "application/vnd.ladok-resultat+json")
          .syncBody(betyg)
          .retrieve()
          .bodyToMono(String.class);

      System.out.println(result2.block());
    }
  }

  @Bean
  public WebClient createWebClient() throws IOException, CertificateException, NoSuchAlgorithmException, KeyStoreException, UnrecoverableKeyException {

    KeyStore clientStore = KeyStore.getInstance("PKCS12");
    clientStore.load(new FileInputStream("/Users/bjorn/git/kth/bth-betygtillladok/BetygTillLadok/cert/ladok.pfx"), "".toCharArray());
    KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    kmf.init(clientStore, "".toCharArray());

    SslContext sslContext = SslContextBuilder
        .forClient()
            .keyManager(kmf)
            .trustManager(InsecureTrustManagerFactory.INSTANCE)
        .build();

    final HttpClient httpClient = HttpClient.create()
        .secure(spec -> spec.sslContext(sslContext));

    final WebClient webClient = WebClient.builder()
        .clientConnector(new ReactorClientHttpConnector(httpClient))
        .filter(logRequest())
        .build();

    return webClient;
  }

  private static ExchangeFilterFunction logRequest() {
    return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
      Logger log = LoggerFactory.getLogger(ResultatrapporteringApplication.class);
      log.info("Request: {} {}", clientRequest.method(), clientRequest.url());
      clientRequest.headers().forEach((name, values) -> values.forEach(value -> log.info("{}={}", name, value)));
      return Mono.just(clientRequest);
    });
  }
}
