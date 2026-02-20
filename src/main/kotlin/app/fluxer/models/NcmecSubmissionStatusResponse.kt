package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class NcmecSubmissionStatusResponse(
  /**
   * NCMEC submission status
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: NcmecSubmissionStatusResponseStatus,
  @param:JsonProperty("ncmec_report_id")
  @get:JsonProperty("ncmec_report_id")
  public val ncmecReportId: String?,
  @param:JsonProperty("submitted_at")
  @get:JsonProperty("submitted_at")
  public val submittedAt: String?,
  @param:JsonProperty("submitted_by_admin_id")
  @get:JsonProperty("submitted_by_admin_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val submittedByAdminId: String,
  @param:JsonProperty("failure_reason")
  @get:JsonProperty("failure_reason")
  public val failureReason: String?,
)
