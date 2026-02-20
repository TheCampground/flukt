package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.net.URI
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class MessageEmbedChildResponse(
  /**
   * The type of embed (e.g., rich, image, video, gifv, article, link)
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  @get:NotNull
  public val type: String,
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  public val url: URI? = null,
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  public val title: String? = null,
  @param:JsonProperty("color")
  @get:JsonProperty("color")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val color: Int? = null,
  @param:JsonProperty("timestamp")
  @get:JsonProperty("timestamp")
  public val timestamp: OffsetDateTime? = null,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String? = null,
  @param:JsonProperty("author")
  @get:JsonProperty("author")
  @get:Valid
  public val author: EmbedAuthorResponse? = null,
  @param:JsonProperty("image")
  @get:JsonProperty("image")
  @get:Valid
  public val image: EmbedMediaResponse? = null,
  @param:JsonProperty("thumbnail")
  @get:JsonProperty("thumbnail")
  @get:Valid
  public val thumbnail: EmbedMediaResponse? = null,
  @param:JsonProperty("footer")
  @get:JsonProperty("footer")
  @get:Valid
  public val footer: EmbedFooterResponse? = null,
  @param:JsonProperty("fields")
  @get:JsonProperty("fields")
  @get:Size(max = 25)
  @get:Valid
  public val fields: List<EmbedFieldResponse>? = null,
  @param:JsonProperty("provider")
  @get:JsonProperty("provider")
  @get:Valid
  public val provider: EmbedAuthorResponse? = null,
  @param:JsonProperty("video")
  @get:JsonProperty("video")
  @get:Valid
  public val video: EmbedMediaResponse? = null,
  @param:JsonProperty("audio")
  @get:JsonProperty("audio")
  @get:Valid
  public val audio: EmbedMediaResponse? = null,
  @param:JsonProperty("nsfw")
  @get:JsonProperty("nsfw")
  public val nsfw: Boolean? = null,
)
