package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

/**
 * Endpoint URLs for various services
 */
public data class WellKnownFluxerResponseEndpoints(
  /**
   * Base URL for authenticated API requests
   */
  @param:JsonProperty("api")
  @get:JsonProperty("api")
  @get:NotNull
  public val api: String,
  /**
   * Base URL for client API requests
   */
  @param:JsonProperty("api_client")
  @get:JsonProperty("api_client")
  @get:NotNull
  public val apiClient: String,
  /**
   * Base URL for public API requests
   */
  @param:JsonProperty("api_public")
  @get:JsonProperty("api_public")
  @get:NotNull
  public val apiPublic: String,
  /**
   * WebSocket URL for the gateway
   */
  @param:JsonProperty("gateway")
  @get:JsonProperty("gateway")
  @get:NotNull
  public val gateway: String,
  /**
   * Base URL for the media proxy
   */
  @param:JsonProperty("media")
  @get:JsonProperty("media")
  @get:NotNull
  public val media: String,
  /**
   * Base URL for static assets (avatars, emojis, etc.)
   */
  @param:JsonProperty("static_cdn")
  @get:JsonProperty("static_cdn")
  @get:NotNull
  public val staticCdn: String,
  /**
   * Base URL for the marketing website
   */
  @param:JsonProperty("marketing")
  @get:JsonProperty("marketing")
  @get:NotNull
  public val marketing: String,
  /**
   * Base URL for the admin panel
   */
  @param:JsonProperty("admin")
  @get:JsonProperty("admin")
  @get:NotNull
  public val admin: String,
  /**
   * Base URL for invite links
   */
  @param:JsonProperty("invite")
  @get:JsonProperty("invite")
  @get:NotNull
  public val invite: String,
  /**
   * Base URL for gift links
   */
  @param:JsonProperty("gift")
  @get:JsonProperty("gift")
  @get:NotNull
  public val gift: String,
  /**
   * Base URL for the web application
   */
  @param:JsonProperty("webapp")
  @get:JsonProperty("webapp")
  @get:NotNull
  public val webapp: String,
)
