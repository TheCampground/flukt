package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String

public data class SsoStatusResponse(
  /**
   * Whether SSO is enabled for this instance
   */
  @param:JsonProperty(
    "enabled",
    required = true,
  )
  @get:JsonProperty("enabled")
  @get:NotNull
  public val enabled: Boolean,
  /**
   * Whether SSO is required for all users
   */
  @param:JsonProperty(
    "enforced",
    required = true,
  )
  @get:JsonProperty("enforced")
  @get:NotNull
  public val enforced: Boolean,
  @param:JsonProperty("display_name")
  @get:JsonProperty("display_name")
  public val displayName: String?,
  /**
   * OAuth redirect URI for SSO
   */
  @param:JsonProperty("redirect_uri")
  @get:JsonProperty("redirect_uri")
  @get:NotNull
  public val redirectUri: String,
)
