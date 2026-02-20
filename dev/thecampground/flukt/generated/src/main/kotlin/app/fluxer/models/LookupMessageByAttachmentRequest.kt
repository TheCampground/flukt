package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class LookupMessageByAttachmentRequest(
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  @param:JsonProperty("attachment_id")
  @get:JsonProperty("attachment_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val attachmentId: String,
  @param:JsonProperty("filename")
  @get:JsonProperty("filename")
  @get:NotNull
  public val filename: String,
  @param:JsonProperty("context_limit")
  @get:JsonProperty("context_limit")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "100",
    inclusive = true,
  )
  public val contextLimit: Int? = null,
)
