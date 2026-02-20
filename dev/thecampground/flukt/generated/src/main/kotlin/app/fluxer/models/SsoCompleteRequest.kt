package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class SsoCompleteRequest(
  /**
   * Authorization code from the SSO provider
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * State parameter for CSRF protection
   */
  @param:JsonProperty("state")
  @get:JsonProperty("state")
  @get:NotNull
  public val state: String,
)
