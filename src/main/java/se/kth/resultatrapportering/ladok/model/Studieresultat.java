
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
    "Resultat",
    "TotaltAntalPoster"
})
public class Studieresultat {

    @JsonProperty("Resultat")
    private List<Resultat> resultat = null;

    @JsonProperty("TotaltAntalPoster")
    private Integer totaltAntalPoster;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Resultat")
    public List<Resultat> getResultat() {
        return resultat;
    }

    @JsonProperty("Resultat")
    public void setResultat(List<Resultat> resultat) {
        this.resultat = resultat;
    }

    @JsonProperty("TotaltAntalPoster")
    public Integer getTotaltAntalPoster() {
        return totaltAntalPoster;
    }

    @JsonProperty("TotaltAntalPoster")
    public void setTotaltAntalPoster(Integer totaltAntalPoster) {
        this.totaltAntalPoster = totaltAntalPoster;
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
        return new ToStringBuilder(this).append("resultat", resultat).append("totaltAntalPoster", totaltAntalPoster).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totaltAntalPoster).append(additionalProperties).append(resultat).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Studieresultat) == false) {
            return false;
        }
        Studieresultat rhs = ((Studieresultat) other);
        return new EqualsBuilder().append(totaltAntalPoster, rhs.totaltAntalPoster).append(additionalProperties, rhs.additionalProperties).append(resultat, rhs.resultat).isEquals();
    }

}
