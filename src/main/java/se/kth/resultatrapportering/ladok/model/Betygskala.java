
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
    "Benamning",
    "Beskrivning",
    "Betygsgrad",
    "Giltighetsperiod",
    "ID",
    "Kod",
    "link"
})
public class Betygskala {

    @JsonProperty("Benamning")
    private Benamning benamning;
    @JsonProperty("Beskrivning")
    private Beskrivning beskrivning;
    @JsonProperty("Betygsgrad")
    private List<Betygsgrad> betygsgrad = null;
    @JsonProperty("Giltighetsperiod")
    private Giltighetsperiod giltighetsperiod;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Kod")
    private String kod;
    @JsonProperty("link")
    private List<Object> link = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
