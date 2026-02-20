package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import kotlin.Long
import kotlin.String
import kotlin.collections.List

/**
 * Array of attachment objects
 */
public data class SlackWebhookRequestAttachments(
  /**
   * Fallback text for notifications
   */
  @param:JsonProperty("fallback")
  @get:JsonProperty("fallback")
  public val fallback: String? = null,
  /**
   * Text that appears above the attachment block
   */
  @param:JsonProperty("pretext")
  @get:JsonProperty("pretext")
  public val pretext: String? = null,
  /**
   * Main text content of the attachment
   */
  @param:JsonProperty("text")
  @get:JsonProperty("text")
  public val text: String? = null,
  /**
   * Colour of the attachment sidebar (hex code or preset)
   */
  @param:JsonProperty("color")
  @get:JsonProperty("color")
  public val color: String? = null,
  /**
   * Title of the attachment
   */
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  public val title: String? = null,
  /**
   * URL to link from the title
   */
  @param:JsonProperty("title_link")
  @get:JsonProperty("title_link")
  public val titleLink: String? = null,
  /**
   * Array of field objects
   */
  @param:JsonProperty("fields")
  @get:JsonProperty("fields")
  @get:Valid
  public val fields: List<SlackWebhookRequestFields>? = null,
  /**
   * Footer text displayed at the bottom
   */
  @param:JsonProperty("footer")
  @get:JsonProperty("footer")
  public val footer: String? = null,
  /**
   * Unix timestamp for the attachment footer
   */
  @param:JsonProperty("ts")
  @get:JsonProperty("ts")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "9007199254740991",
    inclusive = true,
  )
  public val ts: Long? = null,
  /**
   * Name of the author
   */
  @param:JsonProperty("author_name")
  @get:JsonProperty("author_name")
  public val authorName: String? = null,
  /**
   * URL to link from the author name
   */
  @param:JsonProperty("author_link")
  @get:JsonProperty("author_link")
  public val authorLink: String? = null,
  /**
   * URL for the author icon image
   */
  @param:JsonProperty("author_icon")
  @get:JsonProperty("author_icon")
  public val authorIcon: String? = null,
  /**
   * URL of the main image to display
   */
  @param:JsonProperty("image_url")
  @get:JsonProperty("image_url")
  public val imageUrl: String? = null,
  /**
   * URL of a thumbnail image
   */
  @param:JsonProperty("thumb_url")
  @get:JsonProperty("thumb_url")
  public val thumbUrl: String? = null,
)
