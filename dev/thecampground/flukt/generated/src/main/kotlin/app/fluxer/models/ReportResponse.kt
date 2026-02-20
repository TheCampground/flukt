package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class ReportResponse(
  /**
   * The unique identifier for this report
   */
  @param:JsonProperty("report_id")
  @get:JsonProperty("report_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportId: String,
  /**
   * Current status of the report (pending, reviewed, resolved)
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: String,
  /**
   * ISO 8601 timestamp when the report was submitted
   */
  @param:JsonProperty("reported_at")
  @get:JsonProperty("reported_at")
  @get:NotNull
  public val reportedAt: String,
)
