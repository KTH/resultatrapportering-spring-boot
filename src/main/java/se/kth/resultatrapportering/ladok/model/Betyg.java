package se.kth.resultatrapportering.ladok.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Uid",
    "BetygsskalaID",
    "Betygsgrad",
    "Examinationsdatum"
})
public class Betyg {

  @JsonProperty("Uid")
  private String uid;
  @JsonProperty("BetygsskalaID")
  private Integer betygsskalaID;
  @JsonProperty("Betygsgrad")
  private Integer betygsgrad;
  @JsonProperty("Examinationsdatum")
  private String examinationsdatum;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
