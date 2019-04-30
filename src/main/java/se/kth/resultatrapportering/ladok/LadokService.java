package se.kth.resultatrapportering.ladok;

import com.fasterxml.jackson.databind.ObjectMapper;
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
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import se.kth.resultatrapportering.ResultatrapporteringProperties;
import se.kth.resultatrapportering.ladok.model.Betyg;
import se.kth.resultatrapportering.ladok.model.Betygskala;
import se.kth.resultatrapportering.ladok.model.Filtrera;
import se.kth.resultatrapportering.ladok.model.Studieresultat;

@Service
public class LadokService {

  public final Resultat resultat;

  public LadokService(ObjectMapper mapper, ResultatrapporteringProperties props) throws IOException, UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException {
    final WebClient genericDefaultLadokWebClient = createWebClient(props);
    this.resultat = new Resultat(props, genericDefaultLadokWebClient);
  }

  private WebClient createWebClient(ResultatrapporteringProperties props) throws IOException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, CertificateException {

    KeyStore clientStore = KeyStore.getInstance("PKCS12");
    clientStore.load(new FileInputStream(props.getLadokCertificateFileLocation()), "".toCharArray());
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
        //.filter(logRequest())
        .build();

    return webClient;
  }

  public class Resultat {

    private final WebClient webClient;
    private final DefaultUriBuilderFactory builderFactory;

    public Resultat(ResultatrapporteringProperties props, WebClient genericDefaultLadokWebClient) {
      this.builderFactory = new DefaultUriBuilderFactory(props.getLadokBaseUrl() + "/resultat");
      this.webClient = genericDefaultLadokWebClient.mutate()
          .defaultHeader("Content-Type", "application/vnd.ladok-resultat+json")
          .defaultHeader("Accept", "application/vnd.ladok-resultat+json")
          .build();
    }

    public Studieresultat findStudieresultat(String kurstillfalleUID, Filtrera filter) {

      URI studiedeltagare = builderFactory.builder()
          .path("/studieresultat/rapportera/utbildningsinstans/{kurstillfalleUID}/sok")
          .build(kurstillfalleUID);


      return webClient.put()
          .uri(studiedeltagare)
          .syncBody(filter)
          .retrieve()
          .bodyToMono(Studieresultat.class)
          .block();
    }

    public String createStudieresultat(String studieresultatUid, String kurstillfalleUID, Betyg betyg) {

      URI postbetyg = builderFactory.builder()
          .path("/studieresultat/{studieresultatUid}/utbildning/{kurstillfalleUID}/resultat")
          .build(studieresultatUid, kurstillfalleUID);

      return webClient.post()
          .uri(postbetyg)
          .syncBody(betyg)
          .retrieve()
          .bodyToMono(String.class)
          .block();
    }


    public String createStudieresultat(List<Betyg> betygLista) {

      URI postbetyg = builderFactory.builder()
          .path("/studieresultat/skapa")
          .build();

      return webClient.post()
          .uri(postbetyg)
          .syncBody(betygLista)
          .retrieve()
          .bodyToMono(String.class)
          .block();
    }

    public void deleteStudieresultat(String resultatUid) {

      URI deletebetyg = builderFactory.builder()
          .path("/studieresultat/resultat/{resultatId}")
          .build(resultatUid);

      webClient.delete()
          .uri(deletebetyg)
          .retrieve()
          .bodyToMono(Void.class)
          .block();
    }

    public Betygskala findBetygskala(int betygskalaId) {

      URI betygskala = builderFactory.builder()
          .path("/grunddata/betygsskala/{betygskalaId}")
          .build(betygskalaId);

      return webClient.get()
          .uri(betygskala)
          .retrieve()
          .bodyToMono(Betygskala.class)
          .block();
    }

    public String findKursUidByKurstillfalle(String kurstillfalleUID) {

      URI kurstillfalle = builderFactory.builder()
          .path("/kurstillfalle/{kurstillfalleUID}")
          .build(kurstillfalleUID);

      final String json = webClient.get()
          .uri(kurstillfalle)
          .retrieve()
          .bodyToMono(String.class)
          .block();

      return JsonPath.read(json, "$.Utbildningsinstans.UtbildningUID");
    }
  }
}
