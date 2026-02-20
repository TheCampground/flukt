package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int

public data class ChannelOverridesValue(
  /**
   * Channel category collapsed
   */
  @param:JsonProperty(
    "collapsed",
    required = true,
  )
  @get:JsonProperty("collapsed")
  @get:NotNull
  public val collapsed: Boolean,
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
   * Channel muted
   */
  @param:JsonProperty(
    "muted",
    required = true,
  )
  @get:JsonProperty("muted")
  @get:NotNull
  public val muted: Boolean,
  /**
   * Channel mute configuration
   */
  @param:JsonProperty("mute_config")
  @get:JsonProperty("mute_config")
  @get:Valid
  public val muteConfig: MuteConfig? = null,
)
