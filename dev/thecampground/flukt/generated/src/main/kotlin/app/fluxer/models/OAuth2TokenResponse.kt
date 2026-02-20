package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class OAuth2TokenResponse(
  /**
   * The access token for API authorization
   */
  @param:JsonProperty("access_token")
  @get:JsonProperty("access_token")
  @get:NotNull
  public val accessToken: String,
  /**
   * The type of token, typically "Bearer"
   */
  @param:JsonProperty("token_type")
  @get:JsonProperty("token_type")
  @get:NotNull
  public val tokenType: String,
  /**
   * The number of seconds until the access token expires
   */
  @param:JsonProperty(
    "expires_in",
    required = true,
  )
  @get:JsonProperty("expires_in")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val expiresIn: Int,
  /**
   * The refresh token for obtaining new access tokens
   */
  @param:JsonProperty("refresh_token")
  @get:JsonProperty("refresh_token")
  @get:NotNull
  public val refreshToken: String,
  /**
   * The space-separated list of granted scopes
   */
  @param:JsonProperty("scope")
  @get:JsonProperty("scope")
  @get:NotNull
  public val scope: String,
)
