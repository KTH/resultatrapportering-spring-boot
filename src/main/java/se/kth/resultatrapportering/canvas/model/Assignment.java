
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

    private Integer id;
    private String description;
    private String dueAt;
    private String unlockAt;
    private Object lockAt;
    private Integer pointsPossible;
    @JsonProperty("grading_type")
    private String gradingType;
    private Integer assignmentGroupId;
    private Integer gradingStandardId;
    private String createdAt;
    private String updatedAt;
    private Boolean peerReviews;
    private Boolean automaticPeerReviews;
    private Integer position;
    private Boolean gradeGroupStudentsIndividually;
    private Boolean anonymousPeerReviews;
    private Object groupCategoryId;
    private Boolean postToSis;
    private Boolean moderatedGrading;
    private Boolean omitFromFinalGrade;
    private Boolean intraGroupPeerReviews;
    private Boolean anonymousInstructorAnnotations;
    private Boolean anonymousGrading;
    private Boolean gradersAnonymousToGraders;
    private Integer graderCount;
    private Boolean graderCommentsVisibleToGraders;
    private Object finalGraderId;
    private Boolean graderNamesVisibleToFinalGrader;
    private Integer allowedAttempts;
    private String secureParams;
    private Integer courseId;
    private String name;
    private List<String> submissionTypes = null;
    private Boolean hasSubmittedSubmissions;
    private Boolean dueDateRequired;
    private Integer maxNameLength;
    private Boolean isQuizAssignment;
    private Boolean canDuplicate;
    private Object originalCourseId;
    private Object originalAssignmentId;
    private Object originalAssignmentName;
    private String workflowState;
    private Boolean muted;
    private String htmlUrl;
    private Boolean hasOverrides;
    private String integrationId;
    private IntegrationData integrationData;
    private List<String> allowedExtensions = null;
    private Boolean published;
    private Boolean unpublishable;
    private Boolean onlyVisibleToOverrides;
    private Boolean lockedForUser;
    private String submissionsDownloadUrl;
    private Boolean anonymizeStudents;
    private Boolean inClosedGradingPeriod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
