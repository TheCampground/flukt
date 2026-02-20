package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import java.net.URI
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public data class ChannelResponse(
  /**
   * The unique identifier (snowflake) for this channel
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String? = null,
  /**
   * The name of the channel
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  @param:JsonProperty("topic")
  @get:JsonProperty("topic")
  public val topic: String? = null,
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  public val url: URI? = null,
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: String? = null,
  @param:JsonProperty("owner_id")
  @get:JsonProperty("owner_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val ownerId: String? = null,
  /**
   * The type of the channel
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val type: Int,
  @param:JsonProperty("position")
  @get:JsonProperty("position")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val position: Int? = null,
  @param:JsonProperty("parent_id")
  @get:JsonProperty("parent_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val parentId: String? = null,
  @param:JsonProperty("bitrate")
  @get:JsonProperty("bitrate")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val bitrate: Int? = null,
  @param:JsonProperty("user_limit")
  @get:JsonProperty("user_limit")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val userLimit: Int? = null,
  @param:JsonProperty("rtc_region")
  @get:JsonProperty("rtc_region")
  public val rtcRegion: String? = null,
  @param:JsonProperty("last_message_id")
  @get:JsonProperty("last_message_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val lastMessageId: String? = null,
  @param:JsonProperty("last_pin_timestamp")
  @get:JsonProperty("last_pin_timestamp")
  public val lastPinTimestamp: OffsetDateTime? = null,
  /**
   * The permission overwrites for this channel
   */
  @param:JsonProperty("permission_overwrites")
  @get:JsonProperty("permission_overwrites")
  @get:Size(max = 500)
  @get:Valid
  public val permissionOverwrites: List<ChannelOverwriteResponse>? = null,
  /**
   * The recipients of the DM channel
   */
  @param:JsonProperty("recipients")
  @get:JsonProperty("recipients")
  @get:Size(max = 25)
  @get:Valid
  public val recipients: List<UserPartialResponse>? = null,
  /**
   * Whether the channel is marked as NSFW
   */
  @param:JsonProperty("nsfw")
  @get:JsonProperty("nsfw")
  public val nsfw: Boolean? = null,
  @param:JsonProperty("rate_limit_per_user")
  @get:JsonProperty("rate_limit_per_user")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val rateLimitPerUser: Int? = null,
  /**
   * Custom nicknames for users in this channel (for group DMs)
   */
  @param:JsonProperty("nicks")
  @get:JsonProperty("nicks")
  public val nicks: Map<String, String?>? = null,
)
