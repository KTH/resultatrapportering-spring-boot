
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
    "GiltigSomSlutbetyg",
    "ID",
    "Kod",
    "link"
})
public class Betygsgrad {

    @JsonProperty("GiltigSomSlutbetyg")
    private Boolean giltigSomSlutbetyg;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Kod")
    private String kod;
    @JsonProperty("link")
    private List<Object> link = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GiltigSomSlutbetyg")
    public Boolean getGiltigSomSlutbetyg() {
        return giltigSomSlutbetyg;
    }

    @JsonProperty("GiltigSomSlutbetyg")
    public void setGiltigSomSlutbetyg(Boolean giltigSomSlutbetyg) {
        this.giltigSomSlutbetyg = giltigSomSlutbetyg;
    }

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("Kod")
    public String getKod() {
        return kod;
    }

    @JsonProperty("Kod")
    public void setKod(String kod) {
        this.kod = kod;
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
        return new ToStringBuilder(this).append("giltigSomSlutbetyg", giltigSomSlutbetyg).append("iD", iD).append("kod", kod).append("link", link).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(giltigSomSlutbetyg).append(additionalProperties).append(link).append(iD).append(kod).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Betygsgrad) == false) {
            return false;
        }
        Betygsgrad rhs = ((Betygsgrad) other);
        return new EqualsBuilder().append(giltigSomSlutbetyg, rhs.giltigSomSlutbetyg).append(additionalProperties, rhs.additionalProperties).append(link, rhs.link).append(iD, rhs.iD).append(kod, rhs.kod).isEquals();
    }

}
