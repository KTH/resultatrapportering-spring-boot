
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
    "sv",
    "en"
})
public class Benamning {

    @JsonProperty("sv")
    private String sv;
    @JsonProperty("en")
    private String en;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sv")
    public String getSv() {
        return sv;
    }

    @JsonProperty("sv")
    public void setSv(String sv) {
        this.sv = sv;
    }

    @JsonProperty("en")
    public String getEn() {
        return en;
    }

    @JsonProperty("en")
    public void setEn(String en) {
        this.en = en;
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
        return new ToStringBuilder(this).append("sv", sv).append("en", en).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(sv).append(en).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Benamning) == false) {
            return false;
        }
        Benamning rhs = ((Benamning) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(sv, rhs.sv).append(en, rhs.en).isEquals();
    }

}
