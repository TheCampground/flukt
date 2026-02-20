package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Int

public data class WellKnownFluxerResponse(
  /**
   * Version of the API server code
   */
  @param:JsonProperty(
    "api_code_version",
    required = true,
  )
  @get:JsonProperty("api_code_version")
  @get:NotNull
  public val apiCodeVersion: Int,
  /**
   * Endpoint URLs for various services
   */
  @param:JsonProperty("endpoints")
  @get:JsonProperty("endpoints")
  @get:NotNull
  @get:Valid
  public val endpoints: WellKnownFluxerResponseEndpoints,
  /**
   * Captcha configuration
   */
  @param:JsonProperty("captcha")
  @get:JsonProperty("captcha")
  @get:NotNull
  @get:Valid
  public val captcha: WellKnownFluxerResponseCaptcha,
  /**
   * Feature flags for this instance
   */
  @param:JsonProperty("features")
  @get:JsonProperty("features")
  @get:NotNull
  @get:Valid
  public val features: WellKnownFluxerResponseFeatures,
  /**
   * GIF provider configuration for clients
   */
  @param:JsonProperty("gif")
  @get:JsonProperty("gif")
  @get:NotNull
  @get:Valid
  public val gif: WellKnownFluxerResponseGif,
  /**
   * Single sign-on configuration
   */
  @param:JsonProperty("sso")
  @get:JsonProperty("sso")
  @get:NotNull
  @get:Valid
  public val sso: WellKnownFluxerResponseSso,
  /**
   * Limit configuration with rules and trait definitions
   */
  @param:JsonProperty("limits")
  @get:JsonProperty("limits")
  @get:NotNull
  @get:Valid
  public val limits: WellKnownFluxerResponseLimits,
  /**
   * Push notification configuration
   */
  @param:JsonProperty("push")
  @get:JsonProperty("push")
  @get:NotNull
  @get:Valid
  public val push: WellKnownFluxerResponsePush,
  /**
   * Public application configuration for client-side features
   */
  @param:JsonProperty("app_public")
  @get:JsonProperty("app_public")
  @get:NotNull
  @get:Valid
  public val appPublic: WellKnownFluxerResponseAppPublic,
  /**
   * Federation configuration
   */
  @param:JsonProperty("federation")
  @get:JsonProperty("federation")
  @get:Valid
  public val federation: WellKnownFluxerResponseFederation? = null,
  /**
   * Public key for E2E encryption
   */
  @param:JsonProperty("public_key")
  @get:JsonProperty("public_key")
  @get:Valid
  public val publicKey: WellKnownFluxerResponsePublicKey? = null,
  /**
   * OAuth2 endpoints for federation
   */
  @param:JsonProperty("oauth2")
  @get:JsonProperty("oauth2")
  @get:Valid
  public val oauth2: WellKnownFluxerResponseOauth2? = null,
)
