package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class PhoneVerifyRequest(
  @param:JsonProperty("phone")
  @get:JsonProperty("phone")
  @get:NotNull
  @get:Pattern(regexp = "^\\+[1-9]\\d{1,14}${'$'}")
  public val phone: String,
  /**
   * The verification code
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
)
