package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class GuildResponse(
  /**
   * The unique identifier for this guild
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The name of the guild
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: String? = null,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String? = null,
  @param:JsonProperty("banner_width")
  @get:JsonProperty("banner_width")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val bannerWidth: Int? = null,
  @param:JsonProperty("banner_height")
  @get:JsonProperty("banner_height")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val bannerHeight: Int? = null,
  @param:JsonProperty("splash")
  @get:JsonProperty("splash")
  public val splash: String? = null,
  @param:JsonProperty("splash_width")
  @get:JsonProperty("splash_width")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val splashWidth: Int? = null,
  @param:JsonProperty("splash_height")
  @get:JsonProperty("splash_height")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val splashHeight: Int? = null,
  /**
   * The alignment of the splash card
   */
  @param:JsonProperty(
    "splash_card_alignment",
    required = true,
  )
  @get:JsonProperty("splash_card_alignment")
  @get:NotNull
  public val splashCardAlignment: Int,
  @param:JsonProperty("embed_splash")
  @get:JsonProperty("embed_splash")
  public val embedSplash: String? = null,
  @param:JsonProperty("embed_splash_width")
  @get:JsonProperty("embed_splash_width")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val embedSplashWidth: Int? = null,
  @param:JsonProperty("embed_splash_height")
  @get:JsonProperty("embed_splash_height")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val embedSplashHeight: Int? = null,
  @param:JsonProperty("vanity_url_code")
  @get:JsonProperty("vanity_url_code")
  public val vanityUrlCode: String? = null,
  /**
   * The ID of the guild owner
   */
  @param:JsonProperty("owner_id")
  @get:JsonProperty("owner_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val ownerId: String,
  @param:JsonProperty("system_channel_id")
  @get:JsonProperty("system_channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val systemChannelId: String? = null,
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
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val rulesChannelId: String? = null,
  @param:JsonProperty("afk_channel_id")
  @get:JsonProperty("afk_channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val afkChannelId: String? = null,
  /**
   * AFK timeout in seconds before moving users to the AFK channel
   */
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
  /**
   * Array of guild feature flags
   */
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
  /**
   * Bitmask of disabled guild operations
   */
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
  @param:JsonProperty("message_history_cutoff")
  @get:JsonProperty("message_history_cutoff")
  public val messageHistoryCutoff: OffsetDateTime? = null,
  /**
   * The current user permissions in this guild
   */
  @param:JsonProperty("permissions")
  @get:JsonProperty("permissions")
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val permissions: String? = null,
)
