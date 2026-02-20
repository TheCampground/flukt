package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.Map

public data class UserGuildSettingsResponse(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * Notification level preference
   */
  @param:JsonProperty(
    "message_notifications",
    required = true,
  )
  @get:JsonProperty("message_notifications")
  @get:NotNull
  public val messageNotifications: Int,
  /**
   * Whether the guild is muted
   */
  @param:JsonProperty(
    "muted",
    required = true,
  )
  @get:JsonProperty("muted")
  @get:NotNull
  public val muted: Boolean,
  @param:JsonProperty("mute_config")
  @get:JsonProperty("mute_config")
  @get:Valid
  public val muteConfig: UserGuildSettingsResponseMuteConfig?,
  /**
   * Whether mobile push notifications are enabled
   */
  @param:JsonProperty(
    "mobile_push",
    required = true,
  )
  @get:JsonProperty("mobile_push")
  @get:NotNull
  public val mobilePush: Boolean,
  /**
   * Whether @everyone mentions are suppressed
   */
  @param:JsonProperty(
    "suppress_everyone",
    required = true,
  )
  @get:JsonProperty("suppress_everyone")
  @get:NotNull
  public val suppressEveryone: Boolean,
  /**
   * Whether role mentions are suppressed
   */
  @param:JsonProperty(
    "suppress_roles",
    required = true,
  )
  @get:JsonProperty("suppress_roles")
  @get:NotNull
  public val suppressRoles: Boolean,
  /**
   * Whether muted channels are hidden in the sidebar
   */
  @param:JsonProperty(
    "hide_muted_channels",
    required = true,
  )
  @get:JsonProperty("hide_muted_channels")
  @get:NotNull
  public val hideMutedChannels: Boolean,
  @param:JsonProperty("channel_overrides")
  @get:JsonProperty("channel_overrides")
  @get:Valid
  public val channelOverrides: Map<String, ChannelOverridesValue?>?,
  /**
   * The version number of these settings for sync
   */
  @param:JsonProperty(
    "version",
    required = true,
  )
  @get:JsonProperty("version")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val version: Int,
)
