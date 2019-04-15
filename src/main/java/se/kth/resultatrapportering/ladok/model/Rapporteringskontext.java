
package se.kth.resultatrapportering.ladok.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UtbildningUID",
    "UtbildningsinstansUID",
    "BetygsskalaID",
    "KravPaProjekttitel",
    "KravPaHanvisningTillBeslutshandling"
})
public class Rapporteringskontext {

    @JsonProperty("UtbildningUID")
    private String utbildningUID;
    @JsonProperty("UtbildningsinstansUID")
    private String utbildningsinstansUID;
    @JsonProperty("BetygsskalaID")
    private Integer betygsskalaID;
    @JsonProperty("KravPaProjekttitel")
    private Boolean kravPaProjekttitel;
    @JsonProperty("KravPaHanvisningTillBeslutshandling")
    private Boolean kravPaHanvisningTillBeslutshandling;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("UtbildningUID")
    public String getUtbildningUID() {
        return utbildningUID;
    }

    @JsonProperty("UtbildningUID")
    public void setUtbildningUID(String utbildningUID) {
        this.utbildningUID = utbildningUID;
    }

    @JsonProperty("UtbildningsinstansUID")
    public String getUtbildningsinstansUID() {
        return utbildningsinstansUID;
    }

    @JsonProperty("UtbildningsinstansUID")
    public void setUtbildningsinstansUID(String utbildningsinstansUID) {
        this.utbildningsinstansUID = utbildningsinstansUID;
    }

    @JsonProperty("BetygsskalaID")
    public Integer getBetygsskalaID() {
        return betygsskalaID;
    }

    @JsonProperty("BetygsskalaID")
    public void setBetygsskalaID(Integer betygsskalaID) {
        this.betygsskalaID = betygsskalaID;
    }

    @JsonProperty("KravPaProjekttitel")
    public Boolean getKravPaProjekttitel() {
        return kravPaProjekttitel;
    }

    @JsonProperty("KravPaProjekttitel")
    public void setKravPaProjekttitel(Boolean kravPaProjekttitel) {
        this.kravPaProjekttitel = kravPaProjekttitel;
    }

    @JsonProperty("KravPaHanvisningTillBeslutshandling")
    public Boolean getKravPaHanvisningTillBeslutshandling() {
        return kravPaHanvisningTillBeslutshandling;
    }

    @JsonProperty("KravPaHanvisningTillBeslutshandling")
    public void setKravPaHanvisningTillBeslutshandling(Boolean kravPaHanvisningTillBeslutshandling) {
        this.kravPaHanvisningTillBeslutshandling = kravPaHanvisningTillBeslutshandling;
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
        return new ToStringBuilder(this).append("utbildningUID", utbildningUID).append("utbildningsinstansUID", utbildningsinstansUID).append("betygsskalaID", betygsskalaID).append("kravPaProjekttitel", kravPaProjekttitel).append("kravPaHanvisningTillBeslutshandling", kravPaHanvisningTillBeslutshandling).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(utbildningUID).append(additionalProperties).append(kravPaHanvisningTillBeslutshandling).append(betygsskalaID).append(utbildningsinstansUID).append(kravPaProjekttitel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rapporteringskontext) == false) {
            return false;
        }
        Rapporteringskontext rhs = ((Rapporteringskontext) other);
        return new EqualsBuilder().append(utbildningUID, rhs.utbildningUID).append(additionalProperties, rhs.additionalProperties).append(kravPaHanvisningTillBeslutshandling, rhs.kravPaHanvisningTillBeslutshandling).append(betygsskalaID, rhs.betygsskalaID).append(utbildningsinstansUID, rhs.utbildningsinstansUID).append(kravPaProjekttitel, rhs.kravPaProjekttitel).isEquals();
    }

}
