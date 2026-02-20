package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class ResolveReportResponse(
  @param:JsonProperty("report_id")
  @get:JsonProperty("report_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportId: String,
  /**
   * The status of the report
   */
  @param:JsonProperty(
    "status",
    required = true,
  )
  @get:JsonProperty("status")
  @get:NotNull
  public val status: Int,
  @param:JsonProperty("resolved_at")
  @get:JsonProperty("resolved_at")
  public val resolvedAt: String?,
  @param:JsonProperty("public_comment")
  @get:JsonProperty("public_comment")
  public val publicComment: String?,
)
