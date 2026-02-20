package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.math.BigDecimal
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class CreateVoiceRegionRequest(
  /**
   * Unique identifier for the voice region
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * Display name of the voice region
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * Emoji representing the region
   */
  @param:JsonProperty("emoji")
  @get:JsonProperty("emoji")
  @get:NotNull
  public val emoji: String,
  /**
   * Geographic latitude coordinate
   */
  @param:JsonProperty("latitude")
  @get:JsonProperty("latitude")
  @get:NotNull
  public val latitude: BigDecimal,
  /**
   * Geographic longitude coordinate
   */
  @param:JsonProperty("longitude")
  @get:JsonProperty("longitude")
  @get:NotNull
  public val longitude: BigDecimal,
  /**
   * Whether this is the default region
   */
  @param:JsonProperty("is_default")
  @get:JsonProperty("is_default")
  public val isDefault: Boolean? = null,
  /**
   * Whether this region is restricted to VIP users
   */
  @param:JsonProperty("vip_only")
  @get:JsonProperty("vip_only")
  public val vipOnly: Boolean? = null,
  /**
   * Guild features required to use this region
   */
  @param:JsonProperty("required_guild_features")
  @get:JsonProperty("required_guild_features")
  @get:Size(max = 100)
  public val requiredGuildFeatures: List<String>? = null,
  /**
   * Guild IDs explicitly allowed to use this region
   */
  @param:JsonProperty("allowed_guild_ids")
  @get:JsonProperty("allowed_guild_ids")
  @get:Size(max = 1_000)
  public val allowedGuildIds: List<String>? = null,
  /**
   * User IDs explicitly allowed to use this region
   */
  @param:JsonProperty("allowed_user_ids")
  @get:JsonProperty("allowed_user_ids")
  @get:Size(max = 1_000)
  public val allowedUserIds: List<String>? = null,
)
