
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
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page_views",
    "assignments",
    "courses",
    "users"
})
public class Linked {

    private List<Object> pageViews = null;
    private List<Assignment> assignments = null;
    private List<Course> courses = null;
    private List<User> users = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
