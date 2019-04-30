
package se.kth.resultatrapportering.canvas.model;

import java.util.HashMap;
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

    private Integer id;
    private String name;
    private String createdAt;
    private String sortableName;
    private String shortName;
    private String sisUserId;
    private Object integrationId;
    private Integer sisImportId;
    private String loginId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
