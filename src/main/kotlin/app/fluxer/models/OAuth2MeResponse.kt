package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class OAuth2MeResponse(
  /**
   * The application associated with the token
   */
  @param:JsonProperty("application")
  @get:JsonProperty("application")
  @get:NotNull
  @get:Valid
  public val application: OAuth2MeResponseApplication,
  /**
   * The list of granted OAuth2 scopes
   */
  @param:JsonProperty("scopes")
  @get:JsonProperty("scopes")
  @get:NotNull
  @get:Size(max = 50)
  public val scopes: List<String>,
  /**
   * The expiration timestamp of the token
   */
  @param:JsonProperty("expires")
  @get:JsonProperty("expires")
  @get:NotNull
  public val expires: String,
  /**
   * The user associated with the token
   */
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:Valid
  public val user: OAuth2MeResponseUser? = null,
)
