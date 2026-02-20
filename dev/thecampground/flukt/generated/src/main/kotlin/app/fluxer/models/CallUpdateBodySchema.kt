package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class CallUpdateBodySchema(
  @param:JsonProperty("region")
  @get:JsonProperty("region")
  public val region: String? = null,
)
