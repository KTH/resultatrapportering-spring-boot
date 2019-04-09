
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
    "events",
    "linked"
})
public class GradeChanges {

    @JsonProperty("events")
    private List<Event> events = null;
    @JsonProperty("linked")
    private Linked linked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @JsonProperty("linked")
    public Linked getLinked() {
        return linked;
    }

    @JsonProperty("linked")
    public void setLinked(Linked linked) {
        this.linked = linked;
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
        return new ToStringBuilder(this).append("events", events).append("linked", linked).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(events).append(linked).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeChanges) == false) {
            return false;
        }
        GradeChanges rhs = ((GradeChanges) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(events, rhs.events).append(linked, rhs.linked).isEquals();
    }

}
