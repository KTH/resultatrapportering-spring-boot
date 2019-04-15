
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
    "Efternamn",
    "Fornamn",
    "Personnummer",
    "Uid",
    "link"
})
public class Student {

    @JsonProperty("Efternamn")
    private String efternamn;
    @JsonProperty("Fornamn")
    private String fornamn;
    @JsonProperty("Personnummer")
    private String personnummer;
    @JsonProperty("Uid")
    private String uid;
    @JsonProperty("link")
    private List<Link> link = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Efternamn")
    public String getEfternamn() {
        return efternamn;
    }

    @JsonProperty("Efternamn")
    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    @JsonProperty("Fornamn")
    public String getFornamn() {
        return fornamn;
    }

    @JsonProperty("Fornamn")
    public void setFornamn(String fornamn) {
        this.fornamn = fornamn;
    }

    @JsonProperty("Personnummer")
    public String getPersonnummer() {
        return personnummer;
    }

    @JsonProperty("Personnummer")
    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    @JsonProperty("Uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("Uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("link")
    public List<Link> getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(List<Link> link) {
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
        return new ToStringBuilder(this).append("efternamn", efternamn).append("fornamn", fornamn).append("personnummer", personnummer).append("uid", uid).append("link", link).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uid).append(additionalProperties).append(efternamn).append(link).append(personnummer).append(fornamn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Student) == false) {
            return false;
        }
        Student rhs = ((Student) other);
        return new EqualsBuilder().append(uid, rhs.uid).append(additionalProperties, rhs.additionalProperties).append(efternamn, rhs.efternamn).append(link, rhs.link).append(personnummer, rhs.personnummer).append(fornamn, rhs.fornamn).isEquals();
    }

}
