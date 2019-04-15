package se.kth.resultatrapportering.canvas.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

  @JsonProperty("id")
  private Integer id;
  @JsonProperty("body")
  private Object body;
  @JsonProperty("url")
  private Object url;
  @JsonProperty("grade")
  private String grade;
  @JsonProperty("score")
  private Integer score;
  @JsonProperty("submitted_at")
  private Object submittedAt;
  @JsonProperty("assignment_id")
  private Integer assignmentId;
  @JsonProperty("user_id")
  private Integer userId;
  @JsonProperty("submission_type")
  private Object submissionType;
  @JsonProperty("workflow_state")
  private String workflowState;
  @JsonProperty("grade_matches_current_submission")
  private Boolean gradeMatchesCurrentSubmission;
  @JsonProperty("graded_at")
  private String gradedAt;
  @JsonProperty("grader_id")
  private Integer graderId;
  @JsonProperty("attempt")
  private Object attempt;
  @JsonProperty("cached_due_date")
  private String cachedDueDate;
  @JsonProperty("excused")
  private Boolean excused;
  @JsonProperty("late_policy_status")
  private Object latePolicyStatus;
  @JsonProperty("points_deducted")
  private Object pointsDeducted;
  @JsonProperty("grading_period_id")
  private Object gradingPeriodId;
  @JsonProperty("extra_attempts")
  private Object extraAttempts;
  @JsonProperty("late")
  private Boolean late;
  @JsonProperty("missing")
  private Boolean missing;
  @JsonProperty("seconds_late")
  private Integer secondsLate;
  @JsonProperty("entered_grade")
  private String enteredGrade;
  @JsonProperty("entered_score")
  private Integer enteredScore;
  @JsonProperty("preview_url")
  private String previewUrl;
  @JsonProperty("anonymous_id")
  private String anonymousId;
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

  @JsonProperty("body")
  public Object getBody() {
    return body;
  }

  @JsonProperty("body")
  public void setBody(Object body) {
    this.body = body;
  }

  @JsonProperty("url")
  public Object getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(Object url) {
    this.url = url;
  }

  @JsonProperty("grade")
  public String getGrade() {
    return grade;
  }

  @JsonProperty("grade")
  public void setGrade(String grade) {
    this.grade = grade;
  }

  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }

  @JsonProperty("score")
  public void setScore(Integer score) {
    this.score = score;
  }

  @JsonProperty("submitted_at")
  public Object getSubmittedAt() {
    return submittedAt;
  }

  @JsonProperty("submitted_at")
  public void setSubmittedAt(Object submittedAt) {
    this.submittedAt = submittedAt;
  }

  @JsonProperty("assignment_id")
  public Integer getAssignmentId() {
    return assignmentId;
  }

  @JsonProperty("assignment_id")
  public void setAssignmentId(Integer assignmentId) {
    this.assignmentId = assignmentId;
  }

  @JsonProperty("user_id")
  public Integer getUserId() {
    return userId;
  }

  @JsonProperty("user_id")
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  @JsonProperty("submission_type")
  public Object getSubmissionType() {
    return submissionType;
  }

  @JsonProperty("submission_type")
  public void setSubmissionType(Object submissionType) {
    this.submissionType = submissionType;
  }

  @JsonProperty("workflow_state")
  public String getWorkflowState() {
    return workflowState;
  }

  @JsonProperty("workflow_state")
  public void setWorkflowState(String workflowState) {
    this.workflowState = workflowState;
  }

  @JsonProperty("grade_matches_current_submission")
  public Boolean getGradeMatchesCurrentSubmission() {
    return gradeMatchesCurrentSubmission;
  }

  @JsonProperty("grade_matches_current_submission")
  public void setGradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
    this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
  }

  @JsonProperty("graded_at")
  public String getGradedAt() {
    return gradedAt;
  }

  @JsonProperty("graded_at")
  public void setGradedAt(String gradedAt) {
    this.gradedAt = gradedAt;
  }

  @JsonProperty("grader_id")
  public Integer getGraderId() {
    return graderId;
  }

  @JsonProperty("grader_id")
  public void setGraderId(Integer graderId) {
    this.graderId = graderId;
  }

  @JsonProperty("attempt")
  public Object getAttempt() {
    return attempt;
  }

  @JsonProperty("attempt")
  public void setAttempt(Object attempt) {
    this.attempt = attempt;
  }

  @JsonProperty("cached_due_date")
  public String getCachedDueDate() {
    return cachedDueDate;
  }

  @JsonProperty("cached_due_date")
  public void setCachedDueDate(String cachedDueDate) {
    this.cachedDueDate = cachedDueDate;
  }

  @JsonProperty("excused")
  public Boolean getExcused() {
    return excused;
  }

  @JsonProperty("excused")
  public void setExcused(Boolean excused) {
    this.excused = excused;
  }

  @JsonProperty("late_policy_status")
  public Object getLatePolicyStatus() {
    return latePolicyStatus;
  }

  @JsonProperty("late_policy_status")
  public void setLatePolicyStatus(Object latePolicyStatus) {
    this.latePolicyStatus = latePolicyStatus;
  }

  @JsonProperty("points_deducted")
  public Object getPointsDeducted() {
    return pointsDeducted;
  }

  @JsonProperty("points_deducted")
  public void setPointsDeducted(Object pointsDeducted) {
    this.pointsDeducted = pointsDeducted;
  }

  @JsonProperty("grading_period_id")
  public Object getGradingPeriodId() {
    return gradingPeriodId;
  }

  @JsonProperty("grading_period_id")
  public void setGradingPeriodId(Object gradingPeriodId) {
    this.gradingPeriodId = gradingPeriodId;
  }

  @JsonProperty("extra_attempts")
  public Object getExtraAttempts() {
    return extraAttempts;
  }

  @JsonProperty("extra_attempts")
  public void setExtraAttempts(Object extraAttempts) {
    this.extraAttempts = extraAttempts;
  }

  @JsonProperty("late")
  public Boolean getLate() {
    return late;
  }

  @JsonProperty("late")
  public void setLate(Boolean late) {
    this.late = late;
  }

  @JsonProperty("missing")
  public Boolean getMissing() {
    return missing;
  }

  @JsonProperty("missing")
  public void setMissing(Boolean missing) {
    this.missing = missing;
  }

  @JsonProperty("seconds_late")
  public Integer getSecondsLate() {
    return secondsLate;
  }

  @JsonProperty("seconds_late")
  public void setSecondsLate(Integer secondsLate) {
    this.secondsLate = secondsLate;
  }

  @JsonProperty("entered_grade")
  public String getEnteredGrade() {
    return enteredGrade;
  }

  @JsonProperty("entered_grade")
  public void setEnteredGrade(String enteredGrade) {
    this.enteredGrade = enteredGrade;
  }

  @JsonProperty("entered_score")
  public Integer getEnteredScore() {
    return enteredScore;
  }

  @JsonProperty("entered_score")
  public void setEnteredScore(Integer enteredScore) {
    this.enteredScore = enteredScore;
  }

  @JsonProperty("preview_url")
  public String getPreviewUrl() {
    return previewUrl;
  }

  @JsonProperty("preview_url")
  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  @JsonProperty("anonymous_id")
  public String getAnonymousId() {
    return anonymousId;
  }

  @JsonProperty("anonymous_id")
  public void setAnonymousId(String anonymousId) {
    this.anonymousId = anonymousId;
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
    return new ToStringBuilder(this).append("id", id).append("body", body).append("url", url).append("grade", grade).append("score", score).append("submittedAt", submittedAt).append("assignmentId", assignmentId).append("userId", userId).append("submissionType", submissionType).append("workflowState", workflowState).append("gradeMatchesCurrentSubmission", gradeMatchesCurrentSubmission).append("gradedAt", gradedAt).append("graderId", graderId).append("attempt", attempt).append("cachedDueDate", cachedDueDate).append("excused", excused).append("latePolicyStatus", latePolicyStatus).append("pointsDeducted", pointsDeducted).append("gradingPeriodId", gradingPeriodId).append("extraAttempts", extraAttempts).append("late", late).append("missing", missing).append("secondsLate", secondsLate).append("enteredGrade", enteredGrade).append("enteredScore", enteredScore).append("previewUrl", previewUrl).append("anonymousId", anonymousId).append("additionalProperties", additionalProperties).toString();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(attempt).append(body).append(extraAttempts).append(graderId).append(score).append(missing).append(id).append(latePolicyStatus).append(cachedDueDate).append(userId).append(grade).append(excused).append(workflowState).append(gradeMatchesCurrentSubmission).append(submittedAt).append(secondsLate).append(pointsDeducted).append(submissionType).append(enteredScore).append(url).append(previewUrl).append(assignmentId).append(gradingPeriodId).append(anonymousId).append(additionalProperties).append(late).append(enteredGrade).append(gradedAt).toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Submission) == false) {
      return false;
    }
    Submission rhs = ((Submission) other);
    return new EqualsBuilder().append(attempt, rhs.attempt).append(body, rhs.body).append(extraAttempts, rhs.extraAttempts).append(graderId, rhs.graderId).append(score, rhs.score).append(missing, rhs.missing).append(id, rhs.id).append(latePolicyStatus, rhs.latePolicyStatus).append(cachedDueDate, rhs.cachedDueDate).append(userId, rhs.userId).append(grade, rhs.grade).append(excused, rhs.excused).append(workflowState, rhs.workflowState).append(gradeMatchesCurrentSubmission, rhs.gradeMatchesCurrentSubmission).append(submittedAt, rhs.submittedAt).append(secondsLate, rhs.secondsLate).append(pointsDeducted, rhs.pointsDeducted).append(submissionType, rhs.submissionType).append(enteredScore, rhs.enteredScore).append(url, rhs.url).append(previewUrl, rhs.previewUrl).append(assignmentId, rhs.assignmentId).append(gradingPeriodId, rhs.gradingPeriodId).append(anonymousId, rhs.anonymousId).append(additionalProperties, rhs.additionalProperties).append(late, rhs.late).append(enteredGrade, rhs.enteredGrade).append(gradedAt, rhs.gradedAt).isEquals();
  }

}
