package se.kth.resultatrapportering;

import javax.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix="se.kth.rr")
@Validated
@Data
public class ResultatrapporteringProperties {

  /**
   * Url pointing to the Canvas server, in the format https://xxx.yyy.se
   */
  @NotBlank private String canvasBaseUrl;

  /**
   * An authentication token obtained from Canvas
   */
  @NotBlank private String canvasToken;

  /**
   * Url pointing to the Ladok server, in the format https://xxx.yyy.se
   */
  @NotBlank private String ladokBaseUrl;

  /**
   * Full path to certificate store in PFX/PKCS12 format
   */
  @NotBlank private String ladokCertificateFileLocation;

}
