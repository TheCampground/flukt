package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Any
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class LookupGuildResponseGuild(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("owner_id")
  @get:JsonProperty("owner_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val ownerId: String,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("vanity_url_code")
  @get:JsonProperty("vanity_url_code")
  @get:NotNull
  public val vanityUrlCode: Any,
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  @get:NotNull
  public val icon: Any,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  @get:NotNull
  public val banner: Any,
  @param:JsonProperty("splash")
  @get:JsonProperty("splash")
  @get:NotNull
  public val splash: Any,
  @param:JsonProperty("embed_splash")
  @get:JsonProperty("embed_splash")
  @get:NotNull
  public val embedSplash: Any,
  @param:JsonProperty("features")
  @get:JsonProperty("features")
  @get:NotNull
  @get:Size(max = 100)
  public val features: List<String>,
  /**
   * Required verification level for members
   */
  @param:JsonProperty(
    "verification_level",
    required = true,
  )
  @get:JsonProperty("verification_level")
  @get:NotNull
  public val verificationLevel: Int,
  /**
   * Required MFA level for moderation actions
   */
  @param:JsonProperty(
    "mfa_level",
    required = true,
  )
  @get:JsonProperty("mfa_level")
  @get:NotNull
  public val mfaLevel: Int,
  /**
   * The NSFW level of the guild
   */
  @param:JsonProperty(
    "nsfw_level",
    required = true,
  )
  @get:JsonProperty("nsfw_level")
  @get:NotNull
  public val nsfwLevel: Int,
  /**
   * Level of content filtering for explicit media
   */
  @param:JsonProperty(
    "explicit_content_filter",
    required = true,
  )
  @get:JsonProperty("explicit_content_filter")
  @get:NotNull
  public val explicitContentFilter: Int,
  /**
   * Default notification level for new members
   */
  @param:JsonProperty(
    "default_message_notifications",
    required = true,
  )
  @get:JsonProperty("default_message_notifications")
  @get:NotNull
  public val defaultMessageNotifications: Int,
  @param:JsonProperty("afk_channel_id")
  @get:JsonProperty("afk_channel_id")
  @get:NotNull
  public val afkChannelId: Any,
  @param:JsonProperty(
    "afk_timeout",
    required = true,
  )
  @get:JsonProperty("afk_timeout")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val afkTimeout: Int,
  @param:JsonProperty("system_channel_id")
  @get:JsonProperty("system_channel_id")
  @get:NotNull
  public val systemChannelId: Any,
  /**
   * System channel message flags
   */
  @param:JsonProperty(
    "system_channel_flags",
    required = true,
  )
  @get:JsonProperty("system_channel_flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val systemChannelFlags: Int,
  @param:JsonProperty("rules_channel_id")
  @get:JsonProperty("rules_channel_id")
  @get:NotNull
  public val rulesChannelId: Any,
  @param:JsonProperty(
    "disabled_operations",
    required = true,
  )
  @get:JsonProperty("disabled_operations")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val disabledOperations: Int,
  @param:JsonProperty(
    "member_count",
    required = true,
  )
  @get:JsonProperty("member_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val memberCount: Int,
  @param:JsonProperty("channels")
  @get:JsonProperty("channels")
  @get:NotNull
  @get:Size(max = 500)
  @get:Valid
  public val channels: List<LookupGuildResponseChannels>,
  @param:JsonProperty("roles")
  @get:JsonProperty("roles")
  @get:NotNull
  @get:Size(max = 250)
  @get:Valid
  public val roles: List<LookupGuildResponseRoles>,
)
