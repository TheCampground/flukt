package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.net.URI
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class UpdateVoiceServerRequest(
  /**
   * ID of the region this server belongs to
   */
  @param:JsonProperty("region_id")
  @get:JsonProperty("region_id")
  @get:NotNull
  public val regionId: String,
  /**
   * Unique identifier for the voice server
   */
  @param:JsonProperty("server_id")
  @get:JsonProperty("server_id")
  @get:NotNull
  public val serverId: String,
  /**
   * Client signal WebSocket endpoint URL for the voice server
   */
  @param:JsonProperty("endpoint")
  @get:JsonProperty("endpoint")
  public val endpoint: URI? = null,
  /**
   * API key for authenticating with the voice server
   */
  @param:JsonProperty("api_key")
  @get:JsonProperty("api_key")
  public val apiKey: String? = null,
  /**
   * API secret for authenticating with the voice server
   */
  @param:JsonProperty("api_secret")
  @get:JsonProperty("api_secret")
  public val apiSecret: String? = null,
  /**
   * Whether the server is currently active
   */
  @param:JsonProperty("is_active")
  @get:JsonProperty("is_active")
  public val isActive: Boolean? = null,
  /**
   * Whether this server is restricted to VIP users
   */
  @param:JsonProperty("vip_only")
  @get:JsonProperty("vip_only")
  public val vipOnly: Boolean? = null,
  /**
   * Guild features required to use this server
   */
  @param:JsonProperty("required_guild_features")
  @get:JsonProperty("required_guild_features")
  @get:Size(max = 100)
  public val requiredGuildFeatures: List<String>? = null,
  /**
   * Guild IDs explicitly allowed to use this server
   */
  @param:JsonProperty("allowed_guild_ids")
  @get:JsonProperty("allowed_guild_ids")
  @get:Size(max = 1_000)
  public val allowedGuildIds: List<String>? = null,
  /**
   * User IDs explicitly allowed to use this server
   */
  @param:JsonProperty("allowed_user_ids")
  @get:JsonProperty("allowed_user_ids")
  @get:Size(max = 1_000)
  public val allowedUserIds: List<String>? = null,
)
