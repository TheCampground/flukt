package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class MessageShredRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  @param:JsonProperty("entries")
  @get:JsonProperty("entries")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 1_000,
  )
  @get:Valid
  public val entries: List<MessageShredRequestEntries>,
)
