package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class DsaReportEmailVerifyRequest(
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  @get:NotNull
  public val email: String,
  /**
   * Verification code received via email
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
)
