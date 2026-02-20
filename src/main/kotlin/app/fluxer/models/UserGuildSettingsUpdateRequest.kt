package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.Map

public data class UserGuildSettingsUpdateRequest(
  /**
   * Notification level preference
   */
  @param:JsonProperty("message_notifications")
  @get:JsonProperty("message_notifications")
  public val messageNotifications: Int? = null,
  /**
   * Guild muted
   */
  @param:JsonProperty("muted")
  @get:JsonProperty("muted")
  public val muted: Boolean? = null,
  @param:JsonProperty("mute_config")
  @get:JsonProperty("mute_config")
  @get:Valid
  public val muteConfig: UserGuildSettingsUpdateRequestMuteConfig? = null,
  /**
   * Mobile push notifications enabled
   */
  @param:JsonProperty("mobile_push")
  @get:JsonProperty("mobile_push")
  public val mobilePush: Boolean? = null,
  /**
   * Suppress @everyone mentions
   */
  @param:JsonProperty("suppress_everyone")
  @get:JsonProperty("suppress_everyone")
  public val suppressEveryone: Boolean? = null,
  /**
   * Suppress role mentions
   */
  @param:JsonProperty("suppress_roles")
  @get:JsonProperty("suppress_roles")
  public val suppressRoles: Boolean? = null,
  /**
   * Hide muted channels
   */
  @param:JsonProperty("hide_muted_channels")
  @get:JsonProperty("hide_muted_channels")
  public val hideMutedChannels: Boolean? = null,
  @param:JsonProperty("channel_overrides")
  @get:JsonProperty("channel_overrides")
  @get:Valid
  public val channelOverrides: Map<String, ChannelOverridesValue?>? = null,
)
