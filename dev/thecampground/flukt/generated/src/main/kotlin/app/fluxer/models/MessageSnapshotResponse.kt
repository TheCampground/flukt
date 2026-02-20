package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class MessageSnapshotResponse(
  @param:JsonProperty("content")
  @get:JsonProperty("content")
  public val content: String? = null,
  /**
   * The ISO 8601 timestamp of when the original message was created
   */
  @param:JsonProperty("timestamp")
  @get:JsonProperty("timestamp")
  @get:NotNull
  public val timestamp: OffsetDateTime,
  @param:JsonProperty("edited_timestamp")
  @get:JsonProperty("edited_timestamp")
  public val editedTimestamp: OffsetDateTime? = null,
  @param:JsonProperty("mentions")
  @get:JsonProperty("mentions")
  @get:Size(max = 100)
  public val mentions: List<String>? = null,
  @param:JsonProperty("mention_roles")
  @get:JsonProperty("mention_roles")
  @get:Size(max = 100)
  public val mentionRoles: List<String>? = null,
  @param:JsonProperty("embeds")
  @get:JsonProperty("embeds")
  @get:Size(max = 10)
  @get:Valid
  public val embeds: List<MessageEmbedResponse>? = null,
  @param:JsonProperty("attachments")
  @get:JsonProperty("attachments")
  @get:Size(max = 10)
  @get:Valid
  public val attachments: List<MessageAttachmentResponse>? = null,
  @param:JsonProperty("stickers")
  @get:JsonProperty("stickers")
  @get:Size(max = 3)
  @get:Valid
  public val stickers: List<MessageStickerResponse>? = null,
  /**
   * The type of message
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  /**
   * Message flags bitfield
   */
  @param:JsonProperty(
    "flags",
    required = true,
  )
  @get:JsonProperty("flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val flags: Int,
)
