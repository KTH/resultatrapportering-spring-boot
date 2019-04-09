
package se.kth.resultatrapportering.canvas.model;

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
    "id",
    "created_at",
    "event_type",
    "grade_before",
    "grade_after",
    "excused_before",
    "excused_after",
    "graded_anonymously",
    "points_possible_after",
    "points_possible_before",
    "version_number",
    "links"
})
public class Event {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("event_type")
    private String eventType;
    @JsonProperty("grade_before")
    private Object gradeBefore;
    @JsonProperty("grade_after")
    private String gradeAfter;
    @JsonProperty("excused_before")
    private Boolean excusedBefore;
    @JsonProperty("excused_after")
    private Boolean excusedAfter;
    @JsonProperty("graded_anonymously")
    private Boolean gradedAnonymously;
    @JsonProperty("points_possible_after")
    private Integer pointsPossibleAfter;
    @JsonProperty("points_possible_before")
    private Integer pointsPossibleBefore;
    @JsonProperty("version_number")
    private Integer versionNumber;
    @JsonProperty("links")
    private Links links;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("event_type")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("event_type")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("grade_before")
    public Object getGradeBefore() {
        return gradeBefore;
    }

    @JsonProperty("grade_before")
    public void setGradeBefore(Object gradeBefore) {
        this.gradeBefore = gradeBefore;
    }

    @JsonProperty("grade_after")
    public String getGradeAfter() {
        return gradeAfter;
    }

    @JsonProperty("grade_after")
    public void setGradeAfter(String gradeAfter) {
        this.gradeAfter = gradeAfter;
    }

    @JsonProperty("excused_before")
    public Boolean getExcusedBefore() {
        return excusedBefore;
    }

    @JsonProperty("excused_before")
    public void setExcusedBefore(Boolean excusedBefore) {
        this.excusedBefore = excusedBefore;
    }

    @JsonProperty("excused_after")
    public Boolean getExcusedAfter() {
        return excusedAfter;
    }

    @JsonProperty("excused_after")
    public void setExcusedAfter(Boolean excusedAfter) {
        this.excusedAfter = excusedAfter;
    }

    @JsonProperty("graded_anonymously")
    public Boolean getGradedAnonymously() {
        return gradedAnonymously;
    }

    @JsonProperty("graded_anonymously")
    public void setGradedAnonymously(Boolean gradedAnonymously) {
        this.gradedAnonymously = gradedAnonymously;
    }

    @JsonProperty("points_possible_after")
    public Integer getPointsPossibleAfter() {
        return pointsPossibleAfter;
    }

    @JsonProperty("points_possible_after")
    public void setPointsPossibleAfter(Integer pointsPossibleAfter) {
        this.pointsPossibleAfter = pointsPossibleAfter;
    }

    @JsonProperty("points_possible_before")
    public Integer getPointsPossibleBefore() {
        return pointsPossibleBefore;
    }

    @JsonProperty("points_possible_before")
    public void setPointsPossibleBefore(Integer pointsPossibleBefore) {
        this.pointsPossibleBefore = pointsPossibleBefore;
    }

    @JsonProperty("version_number")
    public Integer getVersionNumber() {
        return versionNumber;
    }

    @JsonProperty("version_number")
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    @JsonProperty("links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(Links links) {
        this.links = links;
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
        return new ToStringBuilder(this).append("id", id).append("createdAt", createdAt).append("eventType", eventType).append("gradeBefore", gradeBefore).append("gradeAfter", gradeAfter).append("excusedBefore", excusedBefore).append("excusedAfter", excusedAfter).append("gradedAnonymously", gradedAnonymously).append("pointsPossibleAfter", pointsPossibleAfter).append("pointsPossibleBefore", pointsPossibleBefore).append("versionNumber", versionNumber).append("links", links).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(gradedAnonymously).append(gradeBefore).append(links).append(gradeAfter).append(eventType).append(pointsPossibleAfter).append(excusedAfter).append(id).append(excusedBefore).append(additionalProperties).append(createdAt).append(pointsPossibleBefore).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(gradedAnonymously, rhs.gradedAnonymously).append(gradeBefore, rhs.gradeBefore).append(links, rhs.links).append(gradeAfter, rhs.gradeAfter).append(eventType, rhs.eventType).append(pointsPossibleAfter, rhs.pointsPossibleAfter).append(excusedAfter, rhs.excusedAfter).append(id, rhs.id).append(excusedBefore, rhs.excusedBefore).append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt).append(pointsPossibleBefore, rhs.pointsPossibleBefore).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
