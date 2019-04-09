
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

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("start_at")
    private String startAt;
    @JsonProperty("grading_standard_id")
    private Object gradingStandardId;
    @JsonProperty("is_public")
    private Boolean isPublic;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("course_code")
    private String courseCode;
    @JsonProperty("default_view")
    private String defaultView;
    @JsonProperty("root_account_id")
    private Integer rootAccountId;
    @JsonProperty("enrollment_term_id")
    private Integer enrollmentTermId;
    @JsonProperty("license")
    private String license;
    @JsonProperty("end_at")
    private Object endAt;
    @JsonProperty("public_syllabus")
    private Boolean publicSyllabus;
    @JsonProperty("public_syllabus_to_auth")
    private Boolean publicSyllabusToAuth;
    @JsonProperty("storage_quota_mb")
    private Integer storageQuotaMb;
    @JsonProperty("is_public_to_auth_users")
    private Boolean isPublicToAuthUsers;
    @JsonProperty("apply_assignment_group_weights")
    private Boolean applyAssignmentGroupWeights;
    @JsonProperty("calendar")
    private Calendar calendar;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("blueprint")
    private Boolean blueprint;
    @JsonProperty("sis_course_id")
    private String sisCourseId;
    @JsonProperty("sis_import_id")
    private Integer sisImportId;
    @JsonProperty("integration_id")
    private String integrationId;
    @JsonProperty("enrollments")
    private List<Object> enrollments = null;
    @JsonProperty("hide_final_grades")
    private Boolean hideFinalGrades;
    @JsonProperty("workflow_state")
    private String workflowState;
    @JsonProperty("restrict_enrollments_to_course_dates")
    private Boolean restrictEnrollmentsToCourseDates;
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

    @JsonProperty("account_id")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("start_at")
    public String getStartAt() {
        return startAt;
    }

    @JsonProperty("start_at")
    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    @JsonProperty("grading_standard_id")
    public Object getGradingStandardId() {
        return gradingStandardId;
    }

    @JsonProperty("grading_standard_id")
    public void setGradingStandardId(Object gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }

    @JsonProperty("is_public")
    public Boolean getIsPublic() {
        return isPublic;
    }

    @JsonProperty("is_public")
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("course_code")
    public String getCourseCode() {
        return courseCode;
    }

    @JsonProperty("course_code")
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @JsonProperty("default_view")
    public String getDefaultView() {
        return defaultView;
    }

    @JsonProperty("default_view")
    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }

    @JsonProperty("root_account_id")
    public Integer getRootAccountId() {
        return rootAccountId;
    }

    @JsonProperty("root_account_id")
    public void setRootAccountId(Integer rootAccountId) {
        this.rootAccountId = rootAccountId;
    }

    @JsonProperty("enrollment_term_id")
    public Integer getEnrollmentTermId() {
        return enrollmentTermId;
    }

    @JsonProperty("enrollment_term_id")
    public void setEnrollmentTermId(Integer enrollmentTermId) {
        this.enrollmentTermId = enrollmentTermId;
    }

    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    @JsonProperty("license")
    public void setLicense(String license) {
        this.license = license;
    }

    @JsonProperty("end_at")
    public Object getEndAt() {
        return endAt;
    }

    @JsonProperty("end_at")
    public void setEndAt(Object endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("public_syllabus")
    public Boolean getPublicSyllabus() {
        return publicSyllabus;
    }

    @JsonProperty("public_syllabus")
    public void setPublicSyllabus(Boolean publicSyllabus) {
        this.publicSyllabus = publicSyllabus;
    }

    @JsonProperty("public_syllabus_to_auth")
    public Boolean getPublicSyllabusToAuth() {
        return publicSyllabusToAuth;
    }

    @JsonProperty("public_syllabus_to_auth")
    public void setPublicSyllabusToAuth(Boolean publicSyllabusToAuth) {
        this.publicSyllabusToAuth = publicSyllabusToAuth;
    }

    @JsonProperty("storage_quota_mb")
    public Integer getStorageQuotaMb() {
        return storageQuotaMb;
    }

    @JsonProperty("storage_quota_mb")
    public void setStorageQuotaMb(Integer storageQuotaMb) {
        this.storageQuotaMb = storageQuotaMb;
    }

    @JsonProperty("is_public_to_auth_users")
    public Boolean getIsPublicToAuthUsers() {
        return isPublicToAuthUsers;
    }

    @JsonProperty("is_public_to_auth_users")
    public void setIsPublicToAuthUsers(Boolean isPublicToAuthUsers) {
        this.isPublicToAuthUsers = isPublicToAuthUsers;
    }

    @JsonProperty("apply_assignment_group_weights")
    public Boolean getApplyAssignmentGroupWeights() {
        return applyAssignmentGroupWeights;
    }

    @JsonProperty("apply_assignment_group_weights")
    public void setApplyAssignmentGroupWeights(Boolean applyAssignmentGroupWeights) {
        this.applyAssignmentGroupWeights = applyAssignmentGroupWeights;
    }

    @JsonProperty("calendar")
    public Calendar getCalendar() {
        return calendar;
    }

    @JsonProperty("calendar")
    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("blueprint")
    public Boolean getBlueprint() {
        return blueprint;
    }

    @JsonProperty("blueprint")
    public void setBlueprint(Boolean blueprint) {
        this.blueprint = blueprint;
    }

    @JsonProperty("sis_course_id")
    public String getSisCourseId() {
        return sisCourseId;
    }

    @JsonProperty("sis_course_id")
    public void setSisCourseId(String sisCourseId) {
        this.sisCourseId = sisCourseId;
    }

    @JsonProperty("sis_import_id")
    public Integer getSisImportId() {
        return sisImportId;
    }

    @JsonProperty("sis_import_id")
    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    @JsonProperty("integration_id")
    public String getIntegrationId() {
        return integrationId;
    }

    @JsonProperty("integration_id")
    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    @JsonProperty("enrollments")
    public List<Object> getEnrollments() {
        return enrollments;
    }

    @JsonProperty("enrollments")
    public void setEnrollments(List<Object> enrollments) {
        this.enrollments = enrollments;
    }

    @JsonProperty("hide_final_grades")
    public Boolean getHideFinalGrades() {
        return hideFinalGrades;
    }

    @JsonProperty("hide_final_grades")
    public void setHideFinalGrades(Boolean hideFinalGrades) {
        this.hideFinalGrades = hideFinalGrades;
    }

    @JsonProperty("workflow_state")
    public String getWorkflowState() {
        return workflowState;
    }

    @JsonProperty("workflow_state")
    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    @JsonProperty("restrict_enrollments_to_course_dates")
    public Boolean getRestrictEnrollmentsToCourseDates() {
        return restrictEnrollmentsToCourseDates;
    }

    @JsonProperty("restrict_enrollments_to_course_dates")
    public void setRestrictEnrollmentsToCourseDates(Boolean restrictEnrollmentsToCourseDates) {
        this.restrictEnrollmentsToCourseDates = restrictEnrollmentsToCourseDates;
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
        return new ToStringBuilder(this).append("id", id).append("name", name).append("accountId", accountId).append("uuid", uuid).append("startAt", startAt).append("gradingStandardId", gradingStandardId).append("isPublic", isPublic).append("createdAt", createdAt).append("courseCode", courseCode).append("defaultView", defaultView).append("rootAccountId", rootAccountId).append("enrollmentTermId", enrollmentTermId).append("license", license).append("endAt", endAt).append("publicSyllabus", publicSyllabus).append("publicSyllabusToAuth", publicSyllabusToAuth).append("storageQuotaMb", storageQuotaMb).append("isPublicToAuthUsers", isPublicToAuthUsers).append("applyAssignmentGroupWeights", applyAssignmentGroupWeights).append("calendar", calendar).append("timeZone", timeZone).append("blueprint", blueprint).append("sisCourseId", sisCourseId).append("sisImportId", sisImportId).append("integrationId", integrationId).append("enrollments", enrollments).append("hideFinalGrades", hideFinalGrades).append("workflowState", workflowState).append("restrictEnrollmentsToCourseDates", restrictEnrollmentsToCourseDates).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sisImportId).append(publicSyllabus).append(sisCourseId).append(accountId).append(publicSyllabusToAuth).append(timeZone).append(endAt).append(gradingStandardId).append(storageQuotaMb).append(defaultView).append(rootAccountId).append(courseCode).append(id).append(enrollmentTermId).append(createdAt).append(name).append(license).append(hideFinalGrades).append(calendar).append(workflowState).append(isPublicToAuthUsers).append(applyAssignmentGroupWeights).append(isPublic).append(enrollments).append(additionalProperties).append(integrationId).append(startAt).append(blueprint).append(uuid).append(restrictEnrollmentsToCourseDates).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Course) == false) {
            return false;
        }
        Course rhs = ((Course) other);
        return new EqualsBuilder().append(sisImportId, rhs.sisImportId).append(publicSyllabus, rhs.publicSyllabus).append(sisCourseId, rhs.sisCourseId).append(accountId, rhs.accountId).append(publicSyllabusToAuth, rhs.publicSyllabusToAuth).append(timeZone, rhs.timeZone).append(endAt, rhs.endAt).append(gradingStandardId, rhs.gradingStandardId).append(storageQuotaMb, rhs.storageQuotaMb).append(defaultView, rhs.defaultView).append(rootAccountId, rhs.rootAccountId).append(courseCode, rhs.courseCode).append(id, rhs.id).append(enrollmentTermId, rhs.enrollmentTermId).append(createdAt, rhs.createdAt).append(name, rhs.name).append(license, rhs.license).append(hideFinalGrades, rhs.hideFinalGrades).append(calendar, rhs.calendar).append(workflowState, rhs.workflowState).append(isPublicToAuthUsers, rhs.isPublicToAuthUsers).append(applyAssignmentGroupWeights, rhs.applyAssignmentGroupWeights).append(isPublic, rhs.isPublic).append(enrollments, rhs.enrollments).append(additionalProperties, rhs.additionalProperties).append(integrationId, rhs.integrationId).append(startAt, rhs.startAt).append(blueprint, rhs.blueprint).append(uuid, rhs.uuid).append(restrictEnrollmentsToCourseDates, rhs.restrictEnrollmentsToCourseDates).isEquals();
    }

}
