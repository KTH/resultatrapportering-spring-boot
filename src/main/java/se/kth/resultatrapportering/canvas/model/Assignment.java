
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
    "description",
    "due_at",
    "unlock_at",
    "lock_at",
    "points_possible",
    "grading_type",
    "assignment_group_id",
    "grading_standard_id",
    "created_at",
    "updated_at",
    "peer_reviews",
    "automatic_peer_reviews",
    "position",
    "grade_group_students_individually",
    "anonymous_peer_reviews",
    "group_category_id",
    "post_to_sis",
    "moderated_grading",
    "omit_from_final_grade",
    "intra_group_peer_reviews",
    "anonymous_instructor_annotations",
    "anonymous_grading",
    "graders_anonymous_to_graders",
    "grader_count",
    "grader_comments_visible_to_graders",
    "final_grader_id",
    "grader_names_visible_to_final_grader",
    "allowed_attempts",
    "secure_params",
    "course_id",
    "name",
    "submission_types",
    "has_submitted_submissions",
    "due_date_required",
    "max_name_length",
    "is_quiz_assignment",
    "can_duplicate",
    "original_course_id",
    "original_assignment_id",
    "original_assignment_name",
    "workflow_state",
    "muted",
    "html_url",
    "has_overrides",
    "integration_id",
    "integration_data",
    "allowed_extensions",
    "published",
    "unpublishable",
    "only_visible_to_overrides",
    "locked_for_user",
    "submissions_download_url",
    "anonymize_students",
    "in_closed_grading_period"
})
public class Assignment {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("due_at")
    private String dueAt;
    @JsonProperty("unlock_at")
    private String unlockAt;
    @JsonProperty("lock_at")
    private Object lockAt;
    @JsonProperty("points_possible")
    private Integer pointsPossible;
    @JsonProperty("grading_type")
    private String gradingType;
    @JsonProperty("assignment_group_id")
    private Integer assignmentGroupId;
    @JsonProperty("grading_standard_id")
    private Integer gradingStandardId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("peer_reviews")
    private Boolean peerReviews;
    @JsonProperty("automatic_peer_reviews")
    private Boolean automaticPeerReviews;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("grade_group_students_individually")
    private Boolean gradeGroupStudentsIndividually;
    @JsonProperty("anonymous_peer_reviews")
    private Boolean anonymousPeerReviews;
    @JsonProperty("group_category_id")
    private Object groupCategoryId;
    @JsonProperty("post_to_sis")
    private Boolean postToSis;
    @JsonProperty("moderated_grading")
    private Boolean moderatedGrading;
    @JsonProperty("omit_from_final_grade")
    private Boolean omitFromFinalGrade;
    @JsonProperty("intra_group_peer_reviews")
    private Boolean intraGroupPeerReviews;
    @JsonProperty("anonymous_instructor_annotations")
    private Boolean anonymousInstructorAnnotations;
    @JsonProperty("anonymous_grading")
    private Boolean anonymousGrading;
    @JsonProperty("graders_anonymous_to_graders")
    private Boolean gradersAnonymousToGraders;
    @JsonProperty("grader_count")
    private Integer graderCount;
    @JsonProperty("grader_comments_visible_to_graders")
    private Boolean graderCommentsVisibleToGraders;
    @JsonProperty("final_grader_id")
    private Object finalGraderId;
    @JsonProperty("grader_names_visible_to_final_grader")
    private Boolean graderNamesVisibleToFinalGrader;
    @JsonProperty("allowed_attempts")
    private Integer allowedAttempts;
    @JsonProperty("secure_params")
    private String secureParams;
    @JsonProperty("course_id")
    private Integer courseId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("submission_types")
    private List<String> submissionTypes = null;
    @JsonProperty("has_submitted_submissions")
    private Boolean hasSubmittedSubmissions;
    @JsonProperty("due_date_required")
    private Boolean dueDateRequired;
    @JsonProperty("max_name_length")
    private Integer maxNameLength;
    @JsonProperty("is_quiz_assignment")
    private Boolean isQuizAssignment;
    @JsonProperty("can_duplicate")
    private Boolean canDuplicate;
    @JsonProperty("original_course_id")
    private Object originalCourseId;
    @JsonProperty("original_assignment_id")
    private Object originalAssignmentId;
    @JsonProperty("original_assignment_name")
    private Object originalAssignmentName;
    @JsonProperty("workflow_state")
    private String workflowState;
    @JsonProperty("muted")
    private Boolean muted;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("has_overrides")
    private Boolean hasOverrides;
    @JsonProperty("integration_id")
    private String integrationId;
    @JsonProperty("integration_data")
    private IntegrationData integrationData;
    @JsonProperty("allowed_extensions")
    private List<String> allowedExtensions = null;
    @JsonProperty("published")
    private Boolean published;
    @JsonProperty("unpublishable")
    private Boolean unpublishable;
    @JsonProperty("only_visible_to_overrides")
    private Boolean onlyVisibleToOverrides;
    @JsonProperty("locked_for_user")
    private Boolean lockedForUser;
    @JsonProperty("submissions_download_url")
    private String submissionsDownloadUrl;
    @JsonProperty("anonymize_students")
    private Boolean anonymizeStudents;
    @JsonProperty("in_closed_grading_period")
    private Boolean inClosedGradingPeriod;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("due_at")
    public String getDueAt() {
        return dueAt;
    }

    @JsonProperty("due_at")
    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }

    @JsonProperty("unlock_at")
    public String getUnlockAt() {
        return unlockAt;
    }

    @JsonProperty("unlock_at")
    public void setUnlockAt(String unlockAt) {
        this.unlockAt = unlockAt;
    }

    @JsonProperty("lock_at")
    public Object getLockAt() {
        return lockAt;
    }

    @JsonProperty("lock_at")
    public void setLockAt(Object lockAt) {
        this.lockAt = lockAt;
    }

    @JsonProperty("points_possible")
    public Integer getPointsPossible() {
        return pointsPossible;
    }

    @JsonProperty("points_possible")
    public void setPointsPossible(Integer pointsPossible) {
        this.pointsPossible = pointsPossible;
    }

    @JsonProperty("grading_type")
    public String getGradingType() {
        return gradingType;
    }

    @JsonProperty("grading_type")
    public void setGradingType(String gradingType) {
        this.gradingType = gradingType;
    }

    @JsonProperty("assignment_group_id")
    public Integer getAssignmentGroupId() {
        return assignmentGroupId;
    }

    @JsonProperty("assignment_group_id")
    public void setAssignmentGroupId(Integer assignmentGroupId) {
        this.assignmentGroupId = assignmentGroupId;
    }

    @JsonProperty("grading_standard_id")
    public Integer getGradingStandardId() {
        return gradingStandardId;
    }

    @JsonProperty("grading_standard_id")
    public void setGradingStandardId(Integer gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("peer_reviews")
    public Boolean getPeerReviews() {
        return peerReviews;
    }

    @JsonProperty("peer_reviews")
    public void setPeerReviews(Boolean peerReviews) {
        this.peerReviews = peerReviews;
    }

    @JsonProperty("automatic_peer_reviews")
    public Boolean getAutomaticPeerReviews() {
        return automaticPeerReviews;
    }

    @JsonProperty("automatic_peer_reviews")
    public void setAutomaticPeerReviews(Boolean automaticPeerReviews) {
        this.automaticPeerReviews = automaticPeerReviews;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("grade_group_students_individually")
    public Boolean getGradeGroupStudentsIndividually() {
        return gradeGroupStudentsIndividually;
    }

    @JsonProperty("grade_group_students_individually")
    public void setGradeGroupStudentsIndividually(Boolean gradeGroupStudentsIndividually) {
        this.gradeGroupStudentsIndividually = gradeGroupStudentsIndividually;
    }

    @JsonProperty("anonymous_peer_reviews")
    public Boolean getAnonymousPeerReviews() {
        return anonymousPeerReviews;
    }

    @JsonProperty("anonymous_peer_reviews")
    public void setAnonymousPeerReviews(Boolean anonymousPeerReviews) {
        this.anonymousPeerReviews = anonymousPeerReviews;
    }

    @JsonProperty("group_category_id")
    public Object getGroupCategoryId() {
        return groupCategoryId;
    }

    @JsonProperty("group_category_id")
    public void setGroupCategoryId(Object groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    @JsonProperty("post_to_sis")
    public Boolean getPostToSis() {
        return postToSis;
    }

    @JsonProperty("post_to_sis")
    public void setPostToSis(Boolean postToSis) {
        this.postToSis = postToSis;
    }

    @JsonProperty("moderated_grading")
    public Boolean getModeratedGrading() {
        return moderatedGrading;
    }

    @JsonProperty("moderated_grading")
    public void setModeratedGrading(Boolean moderatedGrading) {
        this.moderatedGrading = moderatedGrading;
    }

    @JsonProperty("omit_from_final_grade")
    public Boolean getOmitFromFinalGrade() {
        return omitFromFinalGrade;
    }

    @JsonProperty("omit_from_final_grade")
    public void setOmitFromFinalGrade(Boolean omitFromFinalGrade) {
        this.omitFromFinalGrade = omitFromFinalGrade;
    }

    @JsonProperty("intra_group_peer_reviews")
    public Boolean getIntraGroupPeerReviews() {
        return intraGroupPeerReviews;
    }

    @JsonProperty("intra_group_peer_reviews")
    public void setIntraGroupPeerReviews(Boolean intraGroupPeerReviews) {
        this.intraGroupPeerReviews = intraGroupPeerReviews;
    }

    @JsonProperty("anonymous_instructor_annotations")
    public Boolean getAnonymousInstructorAnnotations() {
        return anonymousInstructorAnnotations;
    }

    @JsonProperty("anonymous_instructor_annotations")
    public void setAnonymousInstructorAnnotations(Boolean anonymousInstructorAnnotations) {
        this.anonymousInstructorAnnotations = anonymousInstructorAnnotations;
    }

    @JsonProperty("anonymous_grading")
    public Boolean getAnonymousGrading() {
        return anonymousGrading;
    }

    @JsonProperty("anonymous_grading")
    public void setAnonymousGrading(Boolean anonymousGrading) {
        this.anonymousGrading = anonymousGrading;
    }

    @JsonProperty("graders_anonymous_to_graders")
    public Boolean getGradersAnonymousToGraders() {
        return gradersAnonymousToGraders;
    }

    @JsonProperty("graders_anonymous_to_graders")
    public void setGradersAnonymousToGraders(Boolean gradersAnonymousToGraders) {
        this.gradersAnonymousToGraders = gradersAnonymousToGraders;
    }

    @JsonProperty("grader_count")
    public Integer getGraderCount() {
        return graderCount;
    }

    @JsonProperty("grader_count")
    public void setGraderCount(Integer graderCount) {
        this.graderCount = graderCount;
    }

    @JsonProperty("grader_comments_visible_to_graders")
    public Boolean getGraderCommentsVisibleToGraders() {
        return graderCommentsVisibleToGraders;
    }

    @JsonProperty("grader_comments_visible_to_graders")
    public void setGraderCommentsVisibleToGraders(Boolean graderCommentsVisibleToGraders) {
        this.graderCommentsVisibleToGraders = graderCommentsVisibleToGraders;
    }

    @JsonProperty("final_grader_id")
    public Object getFinalGraderId() {
        return finalGraderId;
    }

    @JsonProperty("final_grader_id")
    public void setFinalGraderId(Object finalGraderId) {
        this.finalGraderId = finalGraderId;
    }

    @JsonProperty("grader_names_visible_to_final_grader")
    public Boolean getGraderNamesVisibleToFinalGrader() {
        return graderNamesVisibleToFinalGrader;
    }

    @JsonProperty("grader_names_visible_to_final_grader")
    public void setGraderNamesVisibleToFinalGrader(Boolean graderNamesVisibleToFinalGrader) {
        this.graderNamesVisibleToFinalGrader = graderNamesVisibleToFinalGrader;
    }

    @JsonProperty("allowed_attempts")
    public Integer getAllowedAttempts() {
        return allowedAttempts;
    }

    @JsonProperty("allowed_attempts")
    public void setAllowedAttempts(Integer allowedAttempts) {
        this.allowedAttempts = allowedAttempts;
    }

    @JsonProperty("secure_params")
    public String getSecureParams() {
        return secureParams;
    }

    @JsonProperty("secure_params")
    public void setSecureParams(String secureParams) {
        this.secureParams = secureParams;
    }

    @JsonProperty("course_id")
    public Integer getCourseId() {
        return courseId;
    }

    @JsonProperty("course_id")
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("submission_types")
    public List<String> getSubmissionTypes() {
        return submissionTypes;
    }

    @JsonProperty("submission_types")
    public void setSubmissionTypes(List<String> submissionTypes) {
        this.submissionTypes = submissionTypes;
    }

    @JsonProperty("has_submitted_submissions")
    public Boolean getHasSubmittedSubmissions() {
        return hasSubmittedSubmissions;
    }

    @JsonProperty("has_submitted_submissions")
    public void setHasSubmittedSubmissions(Boolean hasSubmittedSubmissions) {
        this.hasSubmittedSubmissions = hasSubmittedSubmissions;
    }

    @JsonProperty("due_date_required")
    public Boolean getDueDateRequired() {
        return dueDateRequired;
    }

    @JsonProperty("due_date_required")
    public void setDueDateRequired(Boolean dueDateRequired) {
        this.dueDateRequired = dueDateRequired;
    }

    @JsonProperty("max_name_length")
    public Integer getMaxNameLength() {
        return maxNameLength;
    }

    @JsonProperty("max_name_length")
    public void setMaxNameLength(Integer maxNameLength) {
        this.maxNameLength = maxNameLength;
    }

    @JsonProperty("is_quiz_assignment")
    public Boolean getIsQuizAssignment() {
        return isQuizAssignment;
    }

    @JsonProperty("is_quiz_assignment")
    public void setIsQuizAssignment(Boolean isQuizAssignment) {
        this.isQuizAssignment = isQuizAssignment;
    }

    @JsonProperty("can_duplicate")
    public Boolean getCanDuplicate() {
        return canDuplicate;
    }

    @JsonProperty("can_duplicate")
    public void setCanDuplicate(Boolean canDuplicate) {
        this.canDuplicate = canDuplicate;
    }

    @JsonProperty("original_course_id")
    public Object getOriginalCourseId() {
        return originalCourseId;
    }

    @JsonProperty("original_course_id")
    public void setOriginalCourseId(Object originalCourseId) {
        this.originalCourseId = originalCourseId;
    }

    @JsonProperty("original_assignment_id")
    public Object getOriginalAssignmentId() {
        return originalAssignmentId;
    }

    @JsonProperty("original_assignment_id")
    public void setOriginalAssignmentId(Object originalAssignmentId) {
        this.originalAssignmentId = originalAssignmentId;
    }

    @JsonProperty("original_assignment_name")
    public Object getOriginalAssignmentName() {
        return originalAssignmentName;
    }

    @JsonProperty("original_assignment_name")
    public void setOriginalAssignmentName(Object originalAssignmentName) {
        this.originalAssignmentName = originalAssignmentName;
    }

    @JsonProperty("workflow_state")
    public String getWorkflowState() {
        return workflowState;
    }

    @JsonProperty("workflow_state")
    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    @JsonProperty("muted")
    public Boolean getMuted() {
        return muted;
    }

    @JsonProperty("muted")
    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("has_overrides")
    public Boolean getHasOverrides() {
        return hasOverrides;
    }

    @JsonProperty("has_overrides")
    public void setHasOverrides(Boolean hasOverrides) {
        this.hasOverrides = hasOverrides;
    }

    @JsonProperty("integration_id")
    public String getIntegrationId() {
        return integrationId;
    }

    @JsonProperty("integration_id")
    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    @JsonProperty("integration_data")
    public IntegrationData getIntegrationData() {
        return integrationData;
    }

    @JsonProperty("integration_data")
    public void setIntegrationData(IntegrationData integrationData) {
        this.integrationData = integrationData;
    }

    @JsonProperty("allowed_extensions")
    public List<String> getAllowedExtensions() {
        return allowedExtensions;
    }

    @JsonProperty("allowed_extensions")
    public void setAllowedExtensions(List<String> allowedExtensions) {
        this.allowedExtensions = allowedExtensions;
    }

    @JsonProperty("published")
    public Boolean getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(Boolean published) {
        this.published = published;
    }

    @JsonProperty("unpublishable")
    public Boolean getUnpublishable() {
        return unpublishable;
    }

    @JsonProperty("unpublishable")
    public void setUnpublishable(Boolean unpublishable) {
        this.unpublishable = unpublishable;
    }

    @JsonProperty("only_visible_to_overrides")
    public Boolean getOnlyVisibleToOverrides() {
        return onlyVisibleToOverrides;
    }

    @JsonProperty("only_visible_to_overrides")
    public void setOnlyVisibleToOverrides(Boolean onlyVisibleToOverrides) {
        this.onlyVisibleToOverrides = onlyVisibleToOverrides;
    }

    @JsonProperty("locked_for_user")
    public Boolean getLockedForUser() {
        return lockedForUser;
    }

    @JsonProperty("locked_for_user")
    public void setLockedForUser(Boolean lockedForUser) {
        this.lockedForUser = lockedForUser;
    }

    @JsonProperty("submissions_download_url")
    public String getSubmissionsDownloadUrl() {
        return submissionsDownloadUrl;
    }

    @JsonProperty("submissions_download_url")
    public void setSubmissionsDownloadUrl(String submissionsDownloadUrl) {
        this.submissionsDownloadUrl = submissionsDownloadUrl;
    }

    @JsonProperty("anonymize_students")
    public Boolean getAnonymizeStudents() {
        return anonymizeStudents;
    }

    @JsonProperty("anonymize_students")
    public void setAnonymizeStudents(Boolean anonymizeStudents) {
        this.anonymizeStudents = anonymizeStudents;
    }

    @JsonProperty("in_closed_grading_period")
    public Boolean getInClosedGradingPeriod() {
        return inClosedGradingPeriod;
    }

    @JsonProperty("in_closed_grading_period")
    public void setInClosedGradingPeriod(Boolean inClosedGradingPeriod) {
        this.inClosedGradingPeriod = inClosedGradingPeriod;
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
        return new ToStringBuilder(this).append("id", id).append("description", description).append("dueAt", dueAt).append("unlockAt", unlockAt).append("lockAt", lockAt).append("pointsPossible", pointsPossible).append("gradingType", gradingType).append("assignmentGroupId", assignmentGroupId).append("gradingStandardId", gradingStandardId).append("createdAt", createdAt).append("updatedAt", updatedAt).append("peerReviews", peerReviews).append("automaticPeerReviews", automaticPeerReviews).append("position", position).append("gradeGroupStudentsIndividually", gradeGroupStudentsIndividually).append("anonymousPeerReviews", anonymousPeerReviews).append("groupCategoryId", groupCategoryId).append("postToSis", postToSis).append("moderatedGrading", moderatedGrading).append("omitFromFinalGrade", omitFromFinalGrade).append("intraGroupPeerReviews", intraGroupPeerReviews).append("anonymousInstructorAnnotations", anonymousInstructorAnnotations).append("anonymousGrading", anonymousGrading).append("gradersAnonymousToGraders", gradersAnonymousToGraders).append("graderCount", graderCount).append("graderCommentsVisibleToGraders", graderCommentsVisibleToGraders).append("finalGraderId", finalGraderId).append("graderNamesVisibleToFinalGrader", graderNamesVisibleToFinalGrader).append("allowedAttempts", allowedAttempts).append("secureParams", secureParams).append("courseId", courseId).append("name", name).append("submissionTypes", submissionTypes).append("hasSubmittedSubmissions", hasSubmittedSubmissions).append("dueDateRequired", dueDateRequired).append("maxNameLength", maxNameLength).append("isQuizAssignment", isQuizAssignment).append("canDuplicate", canDuplicate).append("originalCourseId", originalCourseId).append("originalAssignmentId", originalAssignmentId).append("originalAssignmentName", originalAssignmentName).append("workflowState", workflowState).append("muted", muted).append("htmlUrl", htmlUrl).append("hasOverrides", hasOverrides).append("integrationId", integrationId).append("integrationData", integrationData).append("allowedExtensions", allowedExtensions).append("published", published).append("unpublishable", unpublishable).append("onlyVisibleToOverrides", onlyVisibleToOverrides).append("lockedForUser", lockedForUser).append("submissionsDownloadUrl", submissionsDownloadUrl).append("anonymizeStudents", anonymizeStudents).append("inClosedGradingPeriod", inClosedGradingPeriod).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dueDateRequired).append(graderNamesVisibleToFinalGrader).append(gradingStandardId).append(maxNameLength).append(htmlUrl).append(originalAssignmentId).append(description).append(anonymizeStudents).append(anonymousPeerReviews).append(graderCommentsVisibleToGraders).append(workflowState).append(anonymousGrading).append(omitFromFinalGrade).append(allowedAttempts).append(finalGraderId).append(automaticPeerReviews).append(assignmentGroupId).append(submissionTypes).append(canDuplicate).append(hasSubmittedSubmissions).append(dueAt).append(postToSis).append(additionalProperties).append(integrationId).append(unlockAt).append(originalCourseId).append(position).append(courseId).append(id).append(anonymousInstructorAnnotations).append(hasOverrides).append(lockedForUser).append(onlyVisibleToOverrides).append(createdAt).append(name).append(pointsPossible).append(published).append(groupCategoryId).append(peerReviews).append(allowedExtensions).append(secureParams).append(intraGroupPeerReviews).append(inClosedGradingPeriod).append(muted).append(gradersAnonymousToGraders).append(graderCount).append(moderatedGrading).append(gradeGroupStudentsIndividually).append(gradingType).append(isQuizAssignment).append(integrationData).append(lockAt).append(updatedAt).append(unpublishable).append(submissionsDownloadUrl).append(originalAssignmentName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Assignment) == false) {
            return false;
        }
        Assignment rhs = ((Assignment) other);
        return new EqualsBuilder().append(dueDateRequired, rhs.dueDateRequired).append(graderNamesVisibleToFinalGrader, rhs.graderNamesVisibleToFinalGrader).append(gradingStandardId, rhs.gradingStandardId).append(maxNameLength, rhs.maxNameLength).append(htmlUrl, rhs.htmlUrl).append(originalAssignmentId, rhs.originalAssignmentId).append(description, rhs.description).append(anonymizeStudents, rhs.anonymizeStudents).append(anonymousPeerReviews, rhs.anonymousPeerReviews).append(graderCommentsVisibleToGraders, rhs.graderCommentsVisibleToGraders).append(workflowState, rhs.workflowState).append(anonymousGrading, rhs.anonymousGrading).append(omitFromFinalGrade, rhs.omitFromFinalGrade).append(allowedAttempts, rhs.allowedAttempts).append(finalGraderId, rhs.finalGraderId).append(automaticPeerReviews, rhs.automaticPeerReviews).append(assignmentGroupId, rhs.assignmentGroupId).append(submissionTypes, rhs.submissionTypes).append(canDuplicate, rhs.canDuplicate).append(hasSubmittedSubmissions, rhs.hasSubmittedSubmissions).append(dueAt, rhs.dueAt).append(postToSis, rhs.postToSis).append(additionalProperties, rhs.additionalProperties).append(integrationId, rhs.integrationId).append(unlockAt, rhs.unlockAt).append(originalCourseId, rhs.originalCourseId).append(position, rhs.position).append(courseId, rhs.courseId).append(id, rhs.id).append(anonymousInstructorAnnotations, rhs.anonymousInstructorAnnotations).append(hasOverrides, rhs.hasOverrides).append(lockedForUser, rhs.lockedForUser).append(onlyVisibleToOverrides, rhs.onlyVisibleToOverrides).append(createdAt, rhs.createdAt).append(name, rhs.name).append(pointsPossible, rhs.pointsPossible).append(published, rhs.published).append(groupCategoryId, rhs.groupCategoryId).append(peerReviews, rhs.peerReviews).append(allowedExtensions, rhs.allowedExtensions).append(secureParams, rhs.secureParams).append(intraGroupPeerReviews, rhs.intraGroupPeerReviews).append(inClosedGradingPeriod, rhs.inClosedGradingPeriod).append(muted, rhs.muted).append(gradersAnonymousToGraders, rhs.gradersAnonymousToGraders).append(graderCount, rhs.graderCount).append(moderatedGrading, rhs.moderatedGrading).append(gradeGroupStudentsIndividually, rhs.gradeGroupStudentsIndividually).append(gradingType, rhs.gradingType).append(isQuizAssignment, rhs.isQuizAssignment).append(integrationData, rhs.integrationData).append(lockAt, rhs.lockAt).append(updatedAt, rhs.updatedAt).append(unpublishable, rhs.unpublishable).append(submissionsDownloadUrl, rhs.submissionsDownloadUrl).append(originalAssignmentName, rhs.originalAssignmentName).isEquals();
    }

}
