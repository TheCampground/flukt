package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class MessageAttachmentResponse(
  /**
   * The unique identifier for this attachment
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The name of the attached file
   */
  @param:JsonProperty("filename")
  @get:JsonProperty("filename")
  @get:NotNull
  public val filename: String,
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  public val title: String? = null,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String? = null,
  @param:JsonProperty("content_type")
  @get:JsonProperty("content_type")
  public val contentType: String? = null,
  @param:JsonProperty("content_hash")
  @get:JsonProperty("content_hash")
  public val contentHash: String? = null,
  /**
   * The size of the attachment in bytes
   */
  @param:JsonProperty(
    "size",
    required = true,
  )
  @get:JsonProperty("size")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val size: Int,
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  public val url: String? = null,
  @param:JsonProperty("proxy_url")
  @get:JsonProperty("proxy_url")
  public val proxyUrl: String? = null,
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
  @param:JsonProperty("placeholder")
  @get:JsonProperty("placeholder")
  public val placeholder: String? = null,
  /**
   * Attachment flags
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
  @param:JsonProperty("nsfw")
  @get:JsonProperty("nsfw")
  public val nsfw: Boolean? = null,
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
  @param:JsonProperty("waveform")
  @get:JsonProperty("waveform")
  public val waveform: String? = null,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: String? = null,
  @param:JsonProperty("expired")
  @get:JsonProperty("expired")
  public val expired: Boolean? = null,
)
