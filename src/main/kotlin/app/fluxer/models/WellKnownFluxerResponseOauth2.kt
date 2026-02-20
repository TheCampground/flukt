package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String
import kotlin.collections.List

/**
 * OAuth2 endpoints for federation
 */
public data class WellKnownFluxerResponseOauth2(
  /**
   * OAuth2 authorization endpoint URL
   */
  @param:JsonProperty("authorization_endpoint")
  @get:JsonProperty("authorization_endpoint")
  @get:NotNull
  public val authorizationEndpoint: String,
  /**
   * OAuth2 token endpoint URL
   */
  @param:JsonProperty("token_endpoint")
  @get:JsonProperty("token_endpoint")
  @get:NotNull
  public val tokenEndpoint: String,
  /**
   * OAuth2 userinfo endpoint URL
   */
  @param:JsonProperty("userinfo_endpoint")
  @get:JsonProperty("userinfo_endpoint")
  @get:NotNull
  public val userinfoEndpoint: String,
  /**
   * Supported OAuth2 scopes
   */
  @param:JsonProperty("scopes_supported")
  @get:JsonProperty("scopes_supported")
  @get:NotNull
  public val scopesSupported: List<String>,
)
