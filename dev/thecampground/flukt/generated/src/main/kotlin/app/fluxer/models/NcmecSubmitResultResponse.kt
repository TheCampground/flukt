package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String

public data class NcmecSubmitResultResponse(
  @param:JsonProperty(
    "success",
    required = true,
  )
  @get:JsonProperty("success")
  @get:NotNull
  public val success: Boolean,
  @param:JsonProperty("ncmec_report_id")
  @get:JsonProperty("ncmec_report_id")
  public val ncmecReportId: String?,
  @param:JsonProperty("error")
  @get:JsonProperty("error")
  public val error: String?,
)
