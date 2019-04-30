
package se.kth.resultatrapportering.ladok.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Arbetsunderlag",
    "HarTillgodoraknande",
    "HeltTillgodoraknad",
    "KanExkluderas",
    "TotalTillgodoraknadOmfattning",
    "UtbildningUID",
    "link"
})
public class ResultatPaUtbildningar {

    @JsonProperty("Arbetsunderlag")
    private Arbetsunderlag arbetsunderlag;
    @JsonProperty("HarTillgodoraknande")
    private Boolean harTillgodoraknande;
    @JsonProperty("HeltTillgodoraknad")
    private Boolean heltTillgodoraknad;
    @JsonProperty("KanExkluderas")
    private Boolean kanExkluderas;
    @JsonProperty("TotalTillgodoraknadOmfattning")
    private Integer totalTillgodoraknadOmfattning;
    @JsonProperty("UtbildningUID")
    private String utbildningUID;
    @JsonProperty("link")
    private List<Object> link = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
