package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String
import kotlin.collections.List

public data class CodesResponse(
  @param:JsonProperty("codes")
  @get:JsonProperty("codes")
  @get:NotNull
  public val codes: List<String>,
)
