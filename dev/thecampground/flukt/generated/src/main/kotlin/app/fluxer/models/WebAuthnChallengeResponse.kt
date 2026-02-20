package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class WebAuthnChallengeResponse(
  /**
   * The WebAuthn challenge
   */
  @param:JsonProperty("challenge")
  @get:JsonProperty("challenge")
  @get:NotNull
  public val challenge: String,
)
