package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.math.BigDecimal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class FavoriteMemeResponse(
  /**
   * Unique identifier for the favorite meme
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * ID of the user who owns this favorite meme
   */
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * Display name of the meme
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("alt_text")
  @get:JsonProperty("alt_text")
  public val altText: String? = null,
  /**
   * Tags for categorizing and searching the meme
   */
  @param:JsonProperty("tags")
  @get:JsonProperty("tags")
  @get:NotNull
  public val tags: List<String>,
  /**
   * ID of the attachment storing the meme
   */
  @param:JsonProperty("attachment_id")
  @get:JsonProperty("attachment_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val attachmentId: String,
  /**
   * Original filename of the meme
   */
  @param:JsonProperty("filename")
  @get:JsonProperty("filename")
  @get:NotNull
  public val filename: String,
  /**
   * MIME type of the meme file
   */
  @param:JsonProperty("content_type")
  @get:JsonProperty("content_type")
  @get:NotNull
  public val contentType: String,
  @param:JsonProperty("content_hash")
  @get:JsonProperty("content_hash")
  public val contentHash: String? = null,
  /**
   * File size in bytes
   */
  @param:JsonProperty("size")
  @get:JsonProperty("size")
  @get:NotNull
  public val size: BigDecimal,
  @param:JsonProperty("width")
  @get:JsonProperty("width")
  public val width: Int? = null,
  @param:JsonProperty("height")
  @get:JsonProperty("height")
  public val height: Int? = null,
  @param:JsonProperty("duration")
  @get:JsonProperty("duration")
  public val duration: BigDecimal? = null,
  /**
   * CDN URL to access the meme
   */
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: String,
  /**
   * Whether the meme is a video converted from GIF
   */
  @param:JsonProperty("is_gifv")
  @get:JsonProperty("is_gifv")
  public val isGifv: Boolean? = null,
  @param:JsonProperty("klipy_slug")
  @get:JsonProperty("klipy_slug")
  public val klipySlug: String? = null,
  @param:JsonProperty("tenor_slug_id")
  @get:JsonProperty("tenor_slug_id")
  public val tenorSlugId: String? = null,
)
