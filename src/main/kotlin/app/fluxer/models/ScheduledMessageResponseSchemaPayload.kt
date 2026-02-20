package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * The message content and metadata to be sent
 */
public data class ScheduledMessageResponseSchemaPayload(
  @param:JsonProperty("content")
  @get:JsonProperty("content")
  public val content: String? = null,
  /**
   * Whether this is a text-to-speech message
   */
  @param:JsonProperty("tts")
  @get:JsonProperty("tts")
  public val tts: Boolean? = null,
  /**
   * Array of embed objects attached to the message
   */
  @param:JsonProperty("embeds")
  @get:JsonProperty("embeds")
  @get:Size(max = 10)
  @get:Valid
  public val embeds: List<MessageEmbedResponse>? = null,
  /**
   * Array of attachment objects for the message
   */
  @param:JsonProperty("attachments")
  @get:JsonProperty("attachments")
  @get:Size(max = 10)
  @get:Valid
  public val attachments: List<MessageAttachmentResponse>? = null,
  /**
   * Array of sticker objects attached to the message
   */
  @param:JsonProperty("stickers")
  @get:JsonProperty("stickers")
  @get:Size(max = 3)
  @get:Valid
  public val stickers: List<MessageStickerResponse>? = null,
  /**
   * Array of sticker IDs to include in the message
   */
  @param:JsonProperty("sticker_ids")
  @get:JsonProperty("sticker_ids")
  @get:Size(max = 3)
  public val stickerIds: List<String>? = null,
  @param:JsonProperty("allowed_mentions")
  @get:JsonProperty("allowed_mentions")
  @get:Valid
  public val allowedMentions: ScheduledMessageAllowedMentionsSchema? = null,
  @param:JsonProperty("message_reference")
  @get:JsonProperty("message_reference")
  @get:Valid
  public val messageReference: ScheduledMessageReferenceSchema? = null,
  /**
   * Message flags bitfield
   */
  @param:JsonProperty("flags")
  @get:JsonProperty("flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val flags: Int? = null,
  /**
   * Client-generated identifier for the message
   */
  @param:JsonProperty("nonce")
  @get:JsonProperty("nonce")
  public val nonce: String? = null,
  @param:JsonProperty("favorite_meme_id")
  @get:JsonProperty("favorite_meme_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val favoriteMemeId: String? = null,
)
