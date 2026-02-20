package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import java.time.OffsetDateTime
import kotlin.Any
import kotlin.ByteArray
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public data class GuildUpdateRequest(
  /**
   * The name of the guild (1-100 characters)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: ByteArray? = null,
  @param:JsonProperty("system_channel_id")
  @get:JsonProperty("system_channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val systemChannelId: String? = null,
  /**
   * System channel message flags
   */
  @param:JsonProperty("system_channel_flags")
  @get:JsonProperty("system_channel_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val systemChannelFlags: Int? = null,
  @param:JsonProperty("afk_channel_id")
  @get:JsonProperty("afk_channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val afkChannelId: String? = null,
  /**
   * AFK timeout in seconds (60-3600) before moving users to the AFK channel
   */
  @param:JsonProperty("afk_timeout")
  @get:JsonProperty("afk_timeout")
  @get:DecimalMin(
    value = "60",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "3600",
    inclusive = true,
  )
  public val afkTimeout: Int? = null,
  /**
   * Default notification level for new members
   */
  @param:JsonProperty("default_message_notifications")
  @get:JsonProperty("default_message_notifications")
  public val defaultMessageNotifications: Int? = null,
  /**
   * Required verification level for members
   */
  @param:JsonProperty("verification_level")
  @get:JsonProperty("verification_level")
  public val verificationLevel: Int? = null,
  /**
   * Required MFA level for moderation actions
   */
  @param:JsonProperty("mfa_level")
  @get:JsonProperty("mfa_level")
  public val mfaLevel: Int? = null,
  /**
   * The NSFW level of the guild
   */
  @param:JsonProperty("nsfw_level")
  @get:JsonProperty("nsfw_level")
  public val nsfwLevel: Int? = null,
  /**
   * Level of content filtering for explicit media
   */
  @param:JsonProperty("explicit_content_filter")
  @get:JsonProperty("explicit_content_filter")
  public val explicitContentFilter: Int? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: ByteArray? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("splash")
  @get:JsonProperty("splash")
  public val splash: ByteArray? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("embed_splash")
  @get:JsonProperty("embed_splash")
  public val embedSplash: ByteArray? = null,
  /**
   * Alignment of the splash card (center, left, or right)
   */
  @param:JsonProperty("splash_card_alignment")
  @get:JsonProperty("splash_card_alignment")
  public val splashCardAlignment: Int? = null,
  /**
   * Array of guild feature strings
   */
  @param:JsonProperty("features")
  @get:JsonProperty("features")
  public val features: List<String>? = null,
  @param:JsonProperty("message_history_cutoff")
  @get:JsonProperty("message_history_cutoff")
  public val messageHistoryCutoff: OffsetDateTime? = null,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String? = null,
  /**
   * MFA method to use for verification
   */
  @param:JsonProperty("mfa_method")
  @get:JsonProperty("mfa_method")
  public val mfaMethod: GuildUpdateRequestMfaMethod? = null,
  /**
   * MFA verification code from authenticator app or SMS
   */
  @param:JsonProperty("mfa_code")
  @get:JsonProperty("mfa_code")
  public val mfaCode: String? = null,
  /**
   * WebAuthn authentication response
   */
  @param:JsonProperty("webauthn_response")
  @get:JsonProperty("webauthn_response")
  public val webauthnResponse: Map<String, Any?>? = null,
  /**
   * WebAuthn challenge string
   */
  @param:JsonProperty("webauthn_challenge")
  @get:JsonProperty("webauthn_challenge")
  public val webauthnChallenge: String? = null,
)
