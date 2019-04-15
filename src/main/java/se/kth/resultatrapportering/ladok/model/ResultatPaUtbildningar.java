
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    @JsonProperty("Arbetsunderlag")
    public Arbetsunderlag getArbetsunderlag() {
        return arbetsunderlag;
    }

    @JsonProperty("Arbetsunderlag")
    public void setArbetsunderlag(Arbetsunderlag arbetsunderlag) {
        this.arbetsunderlag = arbetsunderlag;
    }

    @JsonProperty("HarTillgodoraknande")
    public Boolean getHarTillgodoraknande() {
        return harTillgodoraknande;
    }

    @JsonProperty("HarTillgodoraknande")
    public void setHarTillgodoraknande(Boolean harTillgodoraknande) {
        this.harTillgodoraknande = harTillgodoraknande;
    }

    @JsonProperty("HeltTillgodoraknad")
    public Boolean getHeltTillgodoraknad() {
        return heltTillgodoraknad;
    }

    @JsonProperty("HeltTillgodoraknad")
    public void setHeltTillgodoraknad(Boolean heltTillgodoraknad) {
        this.heltTillgodoraknad = heltTillgodoraknad;
    }

    @JsonProperty("KanExkluderas")
    public Boolean getKanExkluderas() {
        return kanExkluderas;
    }

    @JsonProperty("KanExkluderas")
    public void setKanExkluderas(Boolean kanExkluderas) {
        this.kanExkluderas = kanExkluderas;
    }

    @JsonProperty("TotalTillgodoraknadOmfattning")
    public Integer getTotalTillgodoraknadOmfattning() {
        return totalTillgodoraknadOmfattning;
    }

    @JsonProperty("TotalTillgodoraknadOmfattning")
    public void setTotalTillgodoraknadOmfattning(Integer totalTillgodoraknadOmfattning) {
        this.totalTillgodoraknadOmfattning = totalTillgodoraknadOmfattning;
    }

    @JsonProperty("UtbildningUID")
    public String getUtbildningUID() {
        return utbildningUID;
    }

    @JsonProperty("UtbildningUID")
    public void setUtbildningUID(String utbildningUID) {
        this.utbildningUID = utbildningUID;
    }

    @JsonProperty("link")
    public List<Object> getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(List<Object> link) {
        this.link = link;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arbetsunderlag", arbetsunderlag).append("harTillgodoraknande", harTillgodoraknande).append("heltTillgodoraknad", heltTillgodoraknad).append("kanExkluderas", kanExkluderas).append("totalTillgodoraknadOmfattning", totalTillgodoraknadOmfattning).append("utbildningUID", utbildningUID).append("link", link).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(utbildningUID).append(totalTillgodoraknadOmfattning).append(additionalProperties).append(link).append(arbetsunderlag).append(harTillgodoraknande).append(kanExkluderas).append(heltTillgodoraknad).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResultatPaUtbildningar) == false) {
            return false;
        }
        ResultatPaUtbildningar rhs = ((ResultatPaUtbildningar) other);
        return new EqualsBuilder().append(utbildningUID, rhs.utbildningUID).append(totalTillgodoraknadOmfattning, rhs.totalTillgodoraknadOmfattning).append(additionalProperties, rhs.additionalProperties).append(link, rhs.link).append(arbetsunderlag, rhs.arbetsunderlag).append(harTillgodoraknande, rhs.harTillgodoraknande).append(kanExkluderas, rhs.kanExkluderas).append(heltTillgodoraknad, rhs.heltTillgodoraknad).isEquals();
    }

}
