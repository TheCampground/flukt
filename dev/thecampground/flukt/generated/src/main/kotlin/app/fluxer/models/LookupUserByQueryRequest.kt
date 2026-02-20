package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class LookupUserByQueryRequest(
  @param:JsonProperty("query")
  @get:JsonProperty("query")
  @get:NotNull
  public val query: String,
)
