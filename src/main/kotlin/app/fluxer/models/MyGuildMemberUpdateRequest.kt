package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

public data class MyGuildMemberUpdateRequest(
  @param:JsonProperty("nick")
  @get:JsonProperty("nick")
  public val nick: String? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: ByteArray? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: ByteArray? = null,
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  public val bio: String? = null,
  @param:JsonProperty("pronouns")
  @get:JsonProperty("pronouns")
  public val pronouns: String? = null,
  @param:JsonProperty("accent_color")
  @get:JsonProperty("accent_color")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "16777215",
    inclusive = true,
  )
  public val accentColor: Int? = null,
  /**
   * Member profile flags
   */
  @param:JsonProperty("profile_flags")
  @get:JsonProperty("profile_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val profileFlags: Int? = null,
  /**
   * Whether the member is muted in voice channels
   */
  @param:JsonProperty("mute")
  @get:JsonProperty("mute")
  public val mute: Boolean? = null,
  /**
   * Whether the member is deafened in voice channels
   */
  @param:JsonProperty("deaf")
  @get:JsonProperty("deaf")
  public val deaf: Boolean? = null,
  @param:JsonProperty("communication_disabled_until")
  @get:JsonProperty("communication_disabled_until")
  public val communicationDisabledUntil: OffsetDateTime? = null,
  @param:JsonProperty("timeout_reason")
  @get:JsonProperty("timeout_reason")
  public val timeoutReason: String? = null,
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String? = null,
  @param:JsonProperty("connection_id")
  @get:JsonProperty("connection_id")
  public val connectionId: String? = null,
)
