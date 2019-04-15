
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

    @JsonProperty("Betygsgrad")
    public Integer getBetygsgrad() {
        return betygsgrad;
    }

    @JsonProperty("Betygsgrad")
    public void setBetygsgrad(Integer betygsgrad) {
        this.betygsgrad = betygsgrad;
    }

    @JsonProperty("BetygsskalaID")
    public Integer getBetygsskalaID() {
        return betygsskalaID;
    }

    @JsonProperty("BetygsskalaID")
    public void setBetygsskalaID(Integer betygsskalaID) {
        this.betygsskalaID = betygsskalaID;
    }

    @JsonProperty("Examinationsdatum")
    public String getExaminationsdatum() {
        return examinationsdatum;
    }

    @JsonProperty("Examinationsdatum")
    public void setExaminationsdatum(String examinationsdatum) {
        this.examinationsdatum = examinationsdatum;
    }

    @JsonProperty("ForbereddForBorttag")
    public Boolean getForbereddForBorttag() {
        return forbereddForBorttag;
    }

    @JsonProperty("ForbereddForBorttag")
    public void setForbereddForBorttag(Boolean forbereddForBorttag) {
        this.forbereddForBorttag = forbereddForBorttag;
    }

    @JsonProperty("KurstillfalleUID")
    public String getKurstillfalleUID() {
        return kurstillfalleUID;
    }

    @JsonProperty("KurstillfalleUID")
    public void setKurstillfalleUID(String kurstillfalleUID) {
        this.kurstillfalleUID = kurstillfalleUID;
    }

    @JsonProperty("Noteringar")
    public List<Object> getNoteringar() {
        return noteringar;
    }

    @JsonProperty("Noteringar")
    public void setNoteringar(List<Object> noteringar) {
        this.noteringar = noteringar;
    }

    @JsonProperty("ProcessStatus")
    public Integer getProcessStatus() {
        return processStatus;
    }

    @JsonProperty("ProcessStatus")
    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    @JsonProperty("SenasteResultatandring")
    public String getSenasteResultatandring() {
        return senasteResultatandring;
    }

    @JsonProperty("SenasteResultatandring")
    public void setSenasteResultatandring(String senasteResultatandring) {
        this.senasteResultatandring = senasteResultatandring;
    }

    @JsonProperty("StudieresultatUID")
    public String getStudieresultatUID() {
        return studieresultatUID;
    }

    @JsonProperty("StudieresultatUID")
    public void setStudieresultatUID(String studieresultatUID) {
        this.studieresultatUID = studieresultatUID;
    }

    @JsonProperty("Uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("Uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("UtbildningsinstansUID")
    public String getUtbildningsinstansUID() {
        return utbildningsinstansUID;
    }

    @JsonProperty("UtbildningsinstansUID")
    public void setUtbildningsinstansUID(String utbildningsinstansUID) {
        this.utbildningsinstansUID = utbildningsinstansUID;
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
        return new ToStringBuilder(this).append("betygsgrad", betygsgrad).append("betygsskalaID", betygsskalaID).append("examinationsdatum", examinationsdatum).append("forbereddForBorttag", forbereddForBorttag).append("kurstillfalleUID", kurstillfalleUID).append("noteringar", noteringar).append("processStatus", processStatus).append("senasteResultatandring", senasteResultatandring).append("studieresultatUID", studieresultatUID).append("uid", uid).append("utbildningsinstansUID", utbildningsinstansUID).append("link", link).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uid).append(betygsgrad).append(studieresultatUID).append(kurstillfalleUID).append(processStatus).append(noteringar).append(link).append(senasteResultatandring).append(examinationsdatum).append(additionalProperties).append(forbereddForBorttag).append(utbildningsinstansUID).append(betygsskalaID).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Arbetsunderlag) == false) {
            return false;
        }
        Arbetsunderlag rhs = ((Arbetsunderlag) other);
        return new EqualsBuilder().append(uid, rhs.uid).append(betygsgrad, rhs.betygsgrad).append(studieresultatUID, rhs.studieresultatUID).append(kurstillfalleUID, rhs.kurstillfalleUID).append(processStatus, rhs.processStatus).append(noteringar, rhs.noteringar).append(link, rhs.link).append(senasteResultatandring, rhs.senasteResultatandring).append(examinationsdatum, rhs.examinationsdatum).append(additionalProperties, rhs.additionalProperties).append(forbereddForBorttag, rhs.forbereddForBorttag).append(utbildningsinstansUID, rhs.utbildningsinstansUID).append(betygsskalaID, rhs.betygsskalaID).isEquals();
    }

}
