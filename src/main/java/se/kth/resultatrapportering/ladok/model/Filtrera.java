package se.kth.resultatrapportering.ladok.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
    "KurstillfallenUID",
    "Filtrering",
    "GruppUID",
    "StudenterUID",
    "UtbildningsinstansUID",
    "OrderBy",
    "Page",
    "Limit"
})
public class Filtrera {

  @JsonProperty("KurstillfallenUID")
  private List<String> kurstillfallenUID = null;
  @JsonProperty("Filtrering")
  private List<String> filtrering = null;
  @JsonProperty("GruppUID")
  private Object gruppUID;
  @JsonProperty("StudenterUID")
  private Object studenterUID;
  @JsonProperty("UtbildningsinstansUID")
  private String utbildningsinstansUID;
  @JsonProperty("OrderBy")
  private List<String> orderBy = null;
  @JsonProperty("Page")
  private Integer page;
  @JsonProperty("Limit")
  private Integer limit;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
