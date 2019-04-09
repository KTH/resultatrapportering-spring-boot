
package se.kth.resultatrapportering.canvas.model;

import java.util.HashMap;
import java.util.List;
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
    "page_views",
    "assignments",
    "courses",
    "users"
})
public class Linked {

    @JsonProperty("page_views")
    private List<Object> pageViews = null;
    @JsonProperty("assignments")
    private List<Assignment> assignments = null;
    @JsonProperty("courses")
    private List<Course> courses = null;
    @JsonProperty("users")
    private List<User> users = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("page_views")
    public List<Object> getPageViews() {
        return pageViews;
    }

    @JsonProperty("page_views")
    public void setPageViews(List<Object> pageViews) {
        this.pageViews = pageViews;
    }

    @JsonProperty("assignments")
    public List<Assignment> getAssignments() {
        return assignments;
    }

    @JsonProperty("assignments")
    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    @JsonProperty("courses")
    public List<Course> getCourses() {
        return courses;
    }

    @JsonProperty("courses")
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @JsonProperty("users")
    public List<User> getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(List<User> users) {
        this.users = users;
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
        return new ToStringBuilder(this).append("pageViews", pageViews).append("assignments", assignments).append("courses", courses).append("users", users).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(users).append(pageViews).append(courses).append(additionalProperties).append(assignments).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Linked) == false) {
            return false;
        }
        Linked rhs = ((Linked) other);
        return new EqualsBuilder().append(users, rhs.users).append(pageViews, rhs.pageViews).append(courses, rhs.courses).append(additionalProperties, rhs.additionalProperties).append(assignments, rhs.assignments).isEquals();
    }

}
