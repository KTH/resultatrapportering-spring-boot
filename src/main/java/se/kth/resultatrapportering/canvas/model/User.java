
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
    "name",
    "created_at",
    "sortable_name",
    "short_name",
    "sis_user_id",
    "integration_id",
    "sis_import_id",
    "login_id"
})
public class User {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("sortable_name")
    private String sortableName;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("sis_user_id")
    private String sisUserId;
    @JsonProperty("integration_id")
    private Object integrationId;
    @JsonProperty("sis_import_id")
    private Integer sisImportId;
    @JsonProperty("login_id")
    private String loginId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("sortable_name")
    public String getSortableName() {
        return sortableName;
    }

    @JsonProperty("sortable_name")
    public void setSortableName(String sortableName) {
        this.sortableName = sortableName;
    }

    @JsonProperty("short_name")
    public String getShortName() {
        return shortName;
    }

    @JsonProperty("short_name")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty("sis_user_id")
    public String getSisUserId() {
        return sisUserId;
    }

    @JsonProperty("sis_user_id")
    public void setSisUserId(String sisUserId) {
        this.sisUserId = sisUserId;
    }

    @JsonProperty("integration_id")
    public Object getIntegrationId() {
        return integrationId;
    }

    @JsonProperty("integration_id")
    public void setIntegrationId(Object integrationId) {
        this.integrationId = integrationId;
    }

    @JsonProperty("sis_import_id")
    public Integer getSisImportId() {
        return sisImportId;
    }

    @JsonProperty("sis_import_id")
    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    @JsonProperty("login_id")
    public String getLoginId() {
        return loginId;
    }

    @JsonProperty("login_id")
    public void setLoginId(String loginId) {
        this.loginId = loginId;
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
        return new ToStringBuilder(this).append("id", id).append("name", name).append("createdAt", createdAt).append("sortableName", sortableName).append("shortName", shortName).append("sisUserId", sisUserId).append("integrationId", integrationId).append("sisImportId", sisImportId).append("loginId", loginId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sisImportId).append(id).append(loginId).append(sortableName).append(additionalProperties).append(createdAt).append(name).append(integrationId).append(sisUserId).append(shortName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(sisImportId, rhs.sisImportId).append(id, rhs.id).append(loginId, rhs.loginId).append(sortableName, rhs.sortableName).append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt).append(name, rhs.name).append(integrationId, rhs.integrationId).append(sisUserId, rhs.sisUserId).append(shortName, rhs.shortName).isEquals();
    }

}
