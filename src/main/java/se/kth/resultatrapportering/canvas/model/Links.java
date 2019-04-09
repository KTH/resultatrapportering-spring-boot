
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
    "assignment",
    "course",
    "student",
    "grader",
    "page_view"
})
public class Links {

    @JsonProperty("assignment")
    private Integer assignment;
    @JsonProperty("course")
    private Integer course;
    @JsonProperty("student")
    private Integer student;
    @JsonProperty("grader")
    private Integer grader;
    @JsonProperty("page_view")
    private Object pageView;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("assignment")
    public Integer getAssignment() {
        return assignment;
    }

    @JsonProperty("assignment")
    public void setAssignment(Integer assignment) {
        this.assignment = assignment;
    }

    @JsonProperty("course")
    public Integer getCourse() {
        return course;
    }

    @JsonProperty("course")
    public void setCourse(Integer course) {
        this.course = course;
    }

    @JsonProperty("student")
    public Integer getStudent() {
        return student;
    }

    @JsonProperty("student")
    public void setStudent(Integer student) {
        this.student = student;
    }

    @JsonProperty("grader")
    public Integer getGrader() {
        return grader;
    }

    @JsonProperty("grader")
    public void setGrader(Integer grader) {
        this.grader = grader;
    }

    @JsonProperty("page_view")
    public Object getPageView() {
        return pageView;
    }

    @JsonProperty("page_view")
    public void setPageView(Object pageView) {
        this.pageView = pageView;
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
        return new ToStringBuilder(this).append("assignment", assignment).append("course", course).append("student", student).append("grader", grader).append("pageView", pageView).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(course).append(assignment).append(pageView).append(student).append(additionalProperties).append(grader).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return new EqualsBuilder().append(course, rhs.course).append(assignment, rhs.assignment).append(pageView, rhs.pageView).append(student, rhs.student).append(additionalProperties, rhs.additionalProperties).append(grader, rhs.grader).isEquals();
    }

}
