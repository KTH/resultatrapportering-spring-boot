
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

    @JsonProperty("Benamning")
    public Benamning getBenamning() {
        return benamning;
    }

    @JsonProperty("Benamning")
    public void setBenamning(Benamning benamning) {
        this.benamning = benamning;
    }

    @JsonProperty("Beskrivning")
    public Beskrivning getBeskrivning() {
        return beskrivning;
    }

    @JsonProperty("Beskrivning")
    public void setBeskrivning(Beskrivning beskrivning) {
        this.beskrivning = beskrivning;
    }

    @JsonProperty("Betygsgrad")
    public List<Betygsgrad> getBetygsgrad() {
        return betygsgrad;
    }

    @JsonProperty("Betygsgrad")
    public void setBetygsgrad(List<Betygsgrad> betygsgrad) {
        this.betygsgrad = betygsgrad;
    }

    @JsonProperty("Giltighetsperiod")
    public Giltighetsperiod getGiltighetsperiod() {
        return giltighetsperiod;
    }

    @JsonProperty("Giltighetsperiod")
    public void setGiltighetsperiod(Giltighetsperiod giltighetsperiod) {
        this.giltighetsperiod = giltighetsperiod;
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
        return new ToStringBuilder(this).append("benamning", benamning).append("beskrivning", beskrivning).append("betygsgrad", betygsgrad).append("giltighetsperiod", giltighetsperiod).append("iD", iD).append("kod", kod).append("link", link).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(betygsgrad).append(beskrivning).append(additionalProperties).append(link).append(giltighetsperiod).append(iD).append(kod).append(benamning).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Betygskala) == false) {
            return false;
        }
        Betygskala rhs = ((Betygskala) other);
        return new EqualsBuilder().append(betygsgrad, rhs.betygsgrad).append(beskrivning, rhs.beskrivning).append(additionalProperties, rhs.additionalProperties).append(link, rhs.link).append(giltighetsperiod, rhs.giltighetsperiod).append(iD, rhs.iD).append(kod, rhs.kod).append(benamning, rhs.benamning).isEquals();
    }

}
