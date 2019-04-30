
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
    "AktuellKursinstans",
    "AktuelltKurstillfalle",
    "KursUID",
    "Rapporteringskontext",
    "ResultatPaUtbildningar",
    "Student",
    "Uid",
    "link"
})
public class Resultat {

    @JsonProperty("AktuellKursinstans")
    private String aktuellKursinstans;
    @JsonProperty("AktuelltKurstillfalle")
    private String aktuelltKurstillfalle;
    @JsonProperty("KursUID")
    private String kursUID;
    @JsonProperty("Rapporteringskontext")
    private Rapporteringskontext rapporteringskontext;
    @JsonProperty("ResultatPaUtbildningar")
    private List<ResultatPaUtbildningar> resultatPaUtbildningar = null;
    @JsonProperty("Student")
    private Student student;
    @JsonProperty("Uid")
    private String uid;
    @JsonProperty("link")
    private List<Link> link = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
