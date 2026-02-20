package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import java.net.URI
import kotlin.Int
import kotlin.String

public data class EmbedMediaResponse(
  /**
   * The URL of the media
   */
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: String,
  @param:JsonProperty("proxy_url")
  @get:JsonProperty("proxy_url")
  public val proxyUrl: URI? = null,
  @param:JsonProperty("content_type")
  @get:JsonProperty("content_type")
  public val contentType: String? = null,
  @param:JsonProperty("content_hash")
  @get:JsonProperty("content_hash")
  public val contentHash: String? = null,
  @param:JsonProperty("width")
  @get:JsonProperty("width")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val width: Int? = null,
  @param:JsonProperty("height")
  @get:JsonProperty("height")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val height: Int? = null,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String? = null,
  @param:JsonProperty("placeholder")
  @get:JsonProperty("placeholder")
  public val placeholder: String? = null,
  @param:JsonProperty("duration")
  @get:JsonProperty("duration")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val duration: Int? = null,
  /**
   * The bitwise flags for this media
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
