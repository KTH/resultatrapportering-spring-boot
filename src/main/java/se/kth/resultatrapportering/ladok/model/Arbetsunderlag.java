
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
    "Betygsgrad",
    "BetygsskalaID",
    "Examinationsdatum",
    "ForbereddForBorttag",
    "KurstillfalleUID",
    "Noteringar",
    "ProcessStatus",
    "SenasteResultatandring",
    "StudieresultatUID",
    "Uid",
    "UtbildningsinstansUID",
    "link"
})
public class Arbetsunderlag {

    @JsonProperty("Betygsgrad")
    private Integer betygsgrad;
    @JsonProperty("BetygsskalaID")
    private Integer betygsskalaID;
    @JsonProperty("Examinationsdatum")
    private String examinationsdatum;
    @JsonProperty("ForbereddForBorttag")
    private Boolean forbereddForBorttag;
    @JsonProperty("KurstillfalleUID")
    private String kurstillfalleUID;
    @JsonProperty("Noteringar")
    private List<Object> noteringar = null;
    @JsonProperty("ProcessStatus")
    private Integer processStatus;
    @JsonProperty("SenasteResultatandring")
    private String senasteResultatandring;
    @JsonProperty("StudieresultatUID")
    private String studieresultatUID;
    @JsonProperty("Uid")
    private String uid;
    @JsonProperty("UtbildningsinstansUID")
    private String utbildningsinstansUID;
    @JsonProperty("link")
    private List<Link> link = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
