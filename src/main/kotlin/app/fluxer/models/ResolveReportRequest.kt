package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class ResolveReportRequest(
  @param:JsonProperty("report_id")
  @get:JsonProperty("report_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportId: String,
  /**
   * Public comment to include with the resolution
   */
  @param:JsonProperty("public_comment")
  @get:JsonProperty("public_comment")
  public val publicComment: String? = null,
)
