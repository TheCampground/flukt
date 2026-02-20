package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class SsoStartResponse(
  /**
   * URL to redirect user to for SSO authentication
   */
  @param:JsonProperty("authorization_url")
  @get:JsonProperty("authorization_url")
  @get:NotNull
  public val authorizationUrl: String,
  /**
   * State parameter for CSRF protection
   */
  @param:JsonProperty("state")
  @get:JsonProperty("state")
  @get:NotNull
  public val state: String,
  /**
   * Redirect URI after SSO completion
   */
  @param:JsonProperty("redirect_uri")
  @get:JsonProperty("redirect_uri")
  @get:NotNull
  public val redirectUri: String,
)
