package se.kth.resultatrapportering.canvas.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder( {
    "id",
    "body",
    "url",
    "grade",
    "score",
    "submitted_at",
    "assignment_id",
    "user_id",
    "submission_type",
    "workflow_state",
    "grade_matches_current_submission",
    "graded_at",
    "grader_id",
    "attempt",
    "cached_due_date",
    "excused",
    "late_policy_status",
    "points_deducted",
    "grading_period_id",
    "extra_attempts",
    "late",
    "missing",
    "seconds_late",
    "entered_grade",
    "entered_score",
    "preview_url",
    "anonymous_id"
})
public class Submission {

  private Integer id;
  private Object body;
  private Object url;
  private String grade;
  private Integer score;
  private Object submittedAt;
  private Integer assignmentId;
  private Integer userId;
  private Object submissionType;
  private String workflowState;
  private Boolean gradeMatchesCurrentSubmission;
  private String gradedAt;
  private Integer graderId;
  private Object attempt;
  private String cachedDueDate;
  private Boolean excused;
  private Object latePolicyStatus;
  private Object pointsDeducted;
  private Object gradingPeriodId;
  private Object extraAttempts;
  private Boolean late;
  private Boolean missing;
  private Integer secondsLate;
  private String enteredGrade;
  private Integer enteredScore;
  private String previewUrl;
  private String anonymousId;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
