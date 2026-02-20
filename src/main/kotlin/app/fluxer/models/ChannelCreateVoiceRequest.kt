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
import kotlin.collections.List

public data class ChannelCreateVoiceRequest(
  @param:JsonProperty("topic")
  @get:JsonProperty("topic")
  public val topic: String? = null,
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  public val url: String? = null,
  @param:JsonProperty("parent_id")
  @get:JsonProperty("parent_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val parentId: String? = null,
  @param:JsonProperty("bitrate")
  @get:JsonProperty("bitrate")
  @get:DecimalMin(
    value = "8000",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "320000",
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
    value = "99",
    inclusive = true,
  )
  public val userLimit: Int? = null,
  /**
   * Permission overwrites for roles and members
   */
  @param:JsonProperty("permission_overwrites")
  @get:JsonProperty("permission_overwrites")
  @get:Valid
  public val permissionOverwrites: List<ChannelOverwriteRequest>? = null,
  /**
   * Whether the channel is marked as NSFW
   */
  @param:JsonProperty("nsfw")
  @get:JsonProperty("nsfw")
  public val nsfw: Boolean? = null,
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  /**
   * The name of the channel
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
)
