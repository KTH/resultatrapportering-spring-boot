package se.kth.resultatrapportering.ladok.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Uid",
    "BetygsskalaID",
    "Betygsgrad",
    "Examinationsdatum"
})
public class Betyg {

  @JsonProperty("Uid")
  private String uid;
  @JsonProperty("BetygsskalaID")
  private Integer betygsskalaID;
  @JsonProperty("Betygsgrad")
  private Integer betygsgrad;
  @JsonProperty("Examinationsdatum")
  private String examinationsdatum;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("Uid")
  public String getUid() {
    return uid;
  }

  @JsonProperty("Uid")
  public void setUid(String uid) {
    this.uid = uid;
  }

  @JsonProperty("BetygsskalaID")
  public Integer getBetygsskalaID() {
    return betygsskalaID;
  }

  @JsonProperty("BetygsskalaID")
  public void setBetygsskalaID(Integer betygsskalaID) {
    this.betygsskalaID = betygsskalaID;
  }

  @JsonProperty("Betygsgrad")
  public Integer getBetygsgrad() {
    return betygsgrad;
  }

  @JsonProperty("Betygsgrad")
  public void setBetygsgrad(Integer betygsgrad) {
    this.betygsgrad = betygsgrad;
  }

  @JsonProperty("Examinationsdatum")
  public String getExaminationsdatum() {
    return examinationsdatum;
  }

  @JsonProperty("Examinationsdatum")
  public void setExaminationsdatum(String examinationsdatum) {
    this.examinationsdatum = examinationsdatum;
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
    return new ToStringBuilder(this).append("uid", uid).append("betygsskalaID", betygsskalaID).append("betygsgrad", betygsgrad).append("examinationsdatum", examinationsdatum).append("additionalProperties", additionalProperties).toString();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(uid).append(betygsgrad).append(additionalProperties).append(betygsskalaID).append(examinationsdatum).toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Betyg) == false) {
      return false;
    }
    Betyg rhs = ((Betyg) other);
    return new EqualsBuilder().append(uid, rhs.uid).append(betygsgrad, rhs.betygsgrad).append(additionalProperties, rhs.additionalProperties).append(betygsskalaID, rhs.betygsskalaID).append(examinationsdatum, rhs.examinationsdatum).isEquals();
  }

}
