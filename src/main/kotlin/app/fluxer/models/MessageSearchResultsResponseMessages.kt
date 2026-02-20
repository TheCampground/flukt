package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * The messages matching the search query
 */
public data class MessageSearchResultsResponseMessages(
  /**
   * The unique identifier (snowflake) for this message
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The ID of the channel this message was sent in
   */
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  @param:JsonProperty("author")
  @get:JsonProperty("author")
  @get:NotNull
  @get:Valid
  public val author: UserPartialResponse,
  @param:JsonProperty("webhook_id")
  @get:JsonProperty("webhook_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val webhookId: String? = null,
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
  /**
   * The text content of the message
   */
  @param:JsonProperty("content")
  @get:JsonProperty("content")
  @get:NotNull
  public val content: String,
  /**
   * The ISO 8601 timestamp of when the message was created
   */
  @param:JsonProperty("timestamp")
  @get:JsonProperty("timestamp")
  @get:NotNull
  public val timestamp: OffsetDateTime,
  @param:JsonProperty("edited_timestamp")
  @get:JsonProperty("edited_timestamp")
  public val editedTimestamp: OffsetDateTime? = null,
  /**
   * Whether the message is pinned
   */
  @param:JsonProperty(
    "pinned",
    required = true,
  )
  @get:JsonProperty("pinned")
  @get:NotNull
  public val pinned: Boolean,
  /**
   * Whether the message mentions @everyone
   */
  @param:JsonProperty(
    "mention_everyone",
    required = true,
  )
  @get:JsonProperty("mention_everyone")
  @get:NotNull
  public val mentionEveryone: Boolean,
  /**
   * Whether the message was sent as text-to-speech
   */
  @param:JsonProperty("tts")
  @get:JsonProperty("tts")
  public val tts: Boolean? = null,
  @param:JsonProperty("mentions")
  @get:JsonProperty("mentions")
  @get:Size(max = 100)
  @get:Valid
  public val mentions: List<UserPartialResponse>? = null,
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
  @param:JsonProperty("reactions")
  @get:JsonProperty("reactions")
  @get:Size(max = 30)
  @get:Valid
  public val reactions: List<MessageReactionResponse>? = null,
  @param:JsonProperty("message_reference")
  @get:JsonProperty("message_reference")
  @get:Valid
  public val messageReference: MessageReferenceResponse? = null,
  @param:JsonProperty("message_snapshots")
  @get:JsonProperty("message_snapshots")
  @get:Size(max = 10)
  @get:Valid
  public val messageSnapshots: List<MessageSnapshotResponse>? = null,
  @param:JsonProperty("nonce")
  @get:JsonProperty("nonce")
  public val nonce: String? = null,
  @param:JsonProperty("call")
  @get:JsonProperty("call")
  @get:Valid
  public val call: MessageCallResponse? = null,
)
