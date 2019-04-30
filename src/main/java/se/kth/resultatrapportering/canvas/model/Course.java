
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
    "id",
    "name",
    "account_id",
    "uuid",
    "start_at",
    "grading_standard_id",
    "is_public",
    "created_at",
    "course_code",
    "default_view",
    "root_account_id",
    "enrollment_term_id",
    "license",
    "end_at",
    "public_syllabus",
    "public_syllabus_to_auth",
    "storage_quota_mb",
    "is_public_to_auth_users",
    "apply_assignment_group_weights",
    "calendar",
    "time_zone",
    "blueprint",
    "sis_course_id",
    "sis_import_id",
    "integration_id",
    "enrollments",
    "hide_final_grades",
    "workflow_state",
    "restrict_enrollments_to_course_dates"
})
public class Course {

    private Integer id;
    private String name;
    private Integer accountId;
    private String uuid;
    private String startAt;
    private Object gradingStandardId;
    private Boolean isPublic;
    private String createdAt;
    private String courseCode;
    private String defaultView;
    private Integer rootAccountId;
    private Integer enrollmentTermId;
    private String license;
    private Object endAt;
    private Boolean publicSyllabus;
    private Boolean publicSyllabusToAuth;
    private Integer storageQuotaMb;
    private Boolean isPublicToAuthUsers;
    private Boolean applyAssignmentGroupWeights;
    private Calendar calendar;
    private String timeZone;
    private Boolean blueprint;
    private String sisCourseId;
    private Integer sisImportId;
    private String integrationId;
    private List<Object> enrollments = null;
    private Boolean hideFinalGrades;
    private String workflowState;
    private Boolean restrictEnrollmentsToCourseDates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
