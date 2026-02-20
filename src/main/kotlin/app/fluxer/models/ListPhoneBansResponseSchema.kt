package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ListPhoneBansResponseSchema(
  @param:JsonProperty("bans")
  @get:JsonProperty("bans")
  @get:NotNull
  @get:Size(max = 500)
  public val bans: List<String>,
)
