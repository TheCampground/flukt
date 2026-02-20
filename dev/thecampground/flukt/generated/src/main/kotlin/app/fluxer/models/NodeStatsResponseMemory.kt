package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class NodeStatsResponseMemory(
  @param:JsonProperty("total")
  @get:JsonProperty("total")
  @get:NotNull
  @get:Pattern(regexp = "^-?[0-9]+${'$'}")
  public val total: String,
  @param:JsonProperty("processes")
  @get:JsonProperty("processes")
  @get:NotNull
  @get:Pattern(regexp = "^-?[0-9]+${'$'}")
  public val processes: String,
  @param:JsonProperty("system")
  @get:JsonProperty("system")
  @get:NotNull
  @get:Pattern(regexp = "^-?[0-9]+${'$'}")
  public val system: String,
)
