package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class TenorGifResponse(
  /**
   * The unique Tenor result id
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * The title/description of the GIF
   */
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  @get:NotNull
  public val title: String,
  /**
   * The Tenor page URL for the GIF
   */
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: String,
  /**
   * Direct URL to the GIF media file
   */
  @param:JsonProperty("src")
  @get:JsonProperty("src")
  @get:NotNull
  public val src: String,
  /**
   * Proxied URL to the GIF media file
   */
  @param:JsonProperty("proxy_src")
  @get:JsonProperty("proxy_src")
  @get:NotNull
  public val proxySrc: String,
  /**
   * Width of the GIF in pixels
   */
  @param:JsonProperty(
    "width",
    required = true,
  )
  @get:JsonProperty("width")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val width: Int,
  /**
   * Height of the GIF in pixels
   */
  @param:JsonProperty(
    "height",
    required = true,
  )
  @get:JsonProperty("height")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val height: Int,
)
