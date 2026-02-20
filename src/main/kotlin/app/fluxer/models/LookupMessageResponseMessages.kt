package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class LookupMessageResponseMessages(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  @param:JsonProperty("author_id")
  @get:JsonProperty("author_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val authorId: String,
  @param:JsonProperty("author_username")
  @get:JsonProperty("author_username")
  @get:NotNull
  public val authorUsername: String,
  @param:JsonProperty("author_discriminator")
  @get:JsonProperty("author_discriminator")
  @get:NotNull
  public val authorDiscriminator: String,
  @param:JsonProperty("content")
  @get:JsonProperty("content")
  @get:NotNull
  public val content: String,
  @param:JsonProperty("timestamp")
  @get:JsonProperty("timestamp")
  @get:NotNull
  public val timestamp: String,
  @param:JsonProperty("attachments")
  @get:JsonProperty("attachments")
  @get:NotNull
  @get:Size(max = 10)
  @get:Valid
  public val attachments: List<LookupMessageResponseAttachments>,
)
