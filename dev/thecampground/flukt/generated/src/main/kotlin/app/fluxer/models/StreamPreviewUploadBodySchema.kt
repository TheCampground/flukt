package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class StreamPreviewUploadBodySchema(
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  /**
   * Base64-encoded thumbnail image data
   */
  @param:JsonProperty("thumbnail")
  @get:JsonProperty("thumbnail")
  @get:NotNull
  public val thumbnail: String,
  /**
   * MIME type of the thumbnail image
   */
  @param:JsonProperty("content_type")
  @get:JsonProperty("content_type")
  public val contentType: String? = null,
)
