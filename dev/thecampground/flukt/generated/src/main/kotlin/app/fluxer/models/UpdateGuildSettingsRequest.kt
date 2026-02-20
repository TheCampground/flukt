package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class UpdateGuildSettingsRequest(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
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
   * Default notification level for new members
   */
  @param:JsonProperty("default_message_notifications")
  @get:JsonProperty("default_message_notifications")
  public val defaultMessageNotifications: Int? = null,
  /**
   * Bitmask of disabled guild operations
   */
  @param:JsonProperty("disabled_operations")
  @get:JsonProperty("disabled_operations")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val disabledOperations: Int? = null,
)
