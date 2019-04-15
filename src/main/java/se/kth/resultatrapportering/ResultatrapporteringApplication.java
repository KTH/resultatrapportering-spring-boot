package se.kth.resultatrapportering;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
@RequiredArgsConstructor
public class ResultatrapporteringApplication {

  public static void main(String[] args) {
    SpringApplication.run(ResultatrapporteringApplication.class, args);
  }
}
