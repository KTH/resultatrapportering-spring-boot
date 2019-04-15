
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

    @JsonProperty("AktuellKursinstans")
    public String getAktuellKursinstans() {
        return aktuellKursinstans;
    }

    @JsonProperty("AktuellKursinstans")
    public void setAktuellKursinstans(String aktuellKursinstans) {
        this.aktuellKursinstans = aktuellKursinstans;
    }

    @JsonProperty("AktuelltKurstillfalle")
    public String getAktuelltKurstillfalle() {
        return aktuelltKurstillfalle;
    }

    @JsonProperty("AktuelltKurstillfalle")
    public void setAktuelltKurstillfalle(String aktuelltKurstillfalle) {
        this.aktuelltKurstillfalle = aktuelltKurstillfalle;
    }

    @JsonProperty("KursUID")
    public String getKursUID() {
        return kursUID;
    }

    @JsonProperty("KursUID")
    public void setKursUID(String kursUID) {
        this.kursUID = kursUID;
    }

    @JsonProperty("Rapporteringskontext")
    public Rapporteringskontext getRapporteringskontext() {
        return rapporteringskontext;
    }

    @JsonProperty("Rapporteringskontext")
    public void setRapporteringskontext(Rapporteringskontext rapporteringskontext) {
        this.rapporteringskontext = rapporteringskontext;
    }

    @JsonProperty("ResultatPaUtbildningar")
    public List<ResultatPaUtbildningar> getResultatPaUtbildningar() {
        return resultatPaUtbildningar;
    }

    @JsonProperty("ResultatPaUtbildningar")
    public void setResultatPaUtbildningar(List<ResultatPaUtbildningar> resultatPaUtbildningar) {
        this.resultatPaUtbildningar = resultatPaUtbildningar;
    }

    @JsonProperty("Student")
    public Student getStudent() {
        return student;
    }

    @JsonProperty("Student")
    public void setStudent(Student student) {
        this.student = student;
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
        return new ToStringBuilder(this).append("aktuellKursinstans", aktuellKursinstans).append("aktuelltKurstillfalle", aktuelltKurstillfalle).append("kursUID", kursUID).append("rapporteringskontext", rapporteringskontext).append("resultatPaUtbildningar", resultatPaUtbildningar).append("student", student).append("uid", uid).append("link", link).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uid).append(aktuelltKurstillfalle).append(student).append(additionalProperties).append(link).append(kursUID).append(aktuellKursinstans).append(resultatPaUtbildningar).append(rapporteringskontext).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resultat) == false) {
            return false;
        }
        Resultat rhs = ((Resultat) other);
        return new EqualsBuilder().append(uid, rhs.uid).append(aktuelltKurstillfalle, rhs.aktuelltKurstillfalle).append(student, rhs.student).append(additionalProperties, rhs.additionalProperties).append(link, rhs.link).append(kursUID, rhs.kursUID).append(aktuellKursinstans, rhs.aktuellKursinstans).append(resultatPaUtbildningar, rhs.resultatPaUtbildningar).append(rapporteringskontext, rhs.rapporteringskontext).isEquals();
    }

}
