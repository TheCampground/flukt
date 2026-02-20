package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class OAuth2AuthorizationResponse(
  /**
   * The application that was authorized
   */
  @param:JsonProperty("application")
  @get:JsonProperty("application")
  @get:NotNull
  @get:Valid
  public val application: OAuth2AuthorizationResponseApplication,
  /**
   * The list of granted OAuth2 scopes
   */
  @param:JsonProperty("scopes")
  @get:JsonProperty("scopes")
  @get:NotNull
  @get:Size(max = 50)
  public val scopes: List<String>,
  /**
   * The timestamp when the authorization was granted
   */
  @param:JsonProperty("authorized_at")
  @get:JsonProperty("authorized_at")
  @get:NotNull
  public val authorizedAt: String,
)
