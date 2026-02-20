package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class AuthorizeConsentRequest(
  /**
   * The OAuth2 response type
   */
  @param:JsonProperty("response_type")
  @get:JsonProperty("response_type")
  public val responseType: String? = null,
  @param:JsonProperty("client_id")
  @get:JsonProperty("client_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val clientId: String,
  /**
   * The URI to redirect to after authorization
   */
  @param:JsonProperty("redirect_uri")
  @get:JsonProperty("redirect_uri")
  public val redirectUri: String? = null,
  /**
   * The space-separated list of requested scopes
   */
  @param:JsonProperty("scope")
  @get:JsonProperty("scope")
  @get:NotNull
  public val scope: String,
  /**
   * A random string for CSRF protection
   */
  @param:JsonProperty("state")
  @get:JsonProperty("state")
  public val state: String? = null,
  /**
   * The bot permissions to request
   */
  @param:JsonProperty("permissions")
  @get:JsonProperty("permissions")
  public val permissions: String? = null,
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String? = null,
)
