package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class LookupMessageResponse(
  @param:JsonProperty("messages")
  @get:JsonProperty("messages")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val messages: List<LookupMessageResponseMessages>,
  @param:JsonProperty("message_id")
  @get:JsonProperty("message_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val messageId: String,
)
