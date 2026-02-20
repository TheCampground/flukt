package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.net.URI
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Updated voice server
 */
public data class UpdateVoiceServerResponseServer(
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
  @get:NotNull
  public val endpoint: URI,
  /**
   * Whether the server is currently active
   */
  @param:JsonProperty(
    "is_active",
    required = true,
  )
  @get:JsonProperty("is_active")
  @get:NotNull
  public val isActive: Boolean,
  /**
   * Whether this server is restricted to VIP users
   */
  @param:JsonProperty(
    "vip_only",
    required = true,
  )
  @get:JsonProperty("vip_only")
  @get:NotNull
  public val vipOnly: Boolean,
  /**
   * Guild features required to use this server
   */
  @param:JsonProperty("required_guild_features")
  @get:JsonProperty("required_guild_features")
  @get:NotNull
  @get:Size(max = 100)
  public val requiredGuildFeatures: List<String>,
  /**
   * Guild IDs explicitly allowed to use this server
   */
  @param:JsonProperty("allowed_guild_ids")
  @get:JsonProperty("allowed_guild_ids")
  @get:NotNull
  @get:Size(max = 1_000)
  public val allowedGuildIds: List<String>,
  /**
   * User IDs explicitly allowed to use this server
   */
  @param:JsonProperty("allowed_user_ids")
  @get:JsonProperty("allowed_user_ids")
  @get:NotNull
  @get:Size(max = 1_000)
  public val allowedUserIds: List<String>,
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  public val createdAt: String?,
  @param:JsonProperty("updated_at")
  @get:JsonProperty("updated_at")
  public val updatedAt: String?,
)
