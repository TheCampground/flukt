package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class DsaReportEmailSendRequest(
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  @get:NotNull
  public val email: String,
)
