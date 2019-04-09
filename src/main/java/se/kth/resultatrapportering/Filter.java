package se.kth.resultatrapportering;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import reactor.core.publisher.Mono;

public class Filter {

  private static ExchangeFilterFunction logRequest() {
    return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
      Logger log = LoggerFactory.getLogger(ResultatrapporteringApplication.class);
      log.info("Request: {} {}", clientRequest.method(), clientRequest.url());
      clientRequest.headers().forEach((name, values) -> values.forEach(value -> log.info("{}={}", name, value)));
      return Mono.just(clientRequest);
    });
  }
}
