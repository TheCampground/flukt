package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class StreamUpdateBodySchema(
  /**
   * The preferred voice region for the stream (1-64 characters)
   */
  @param:JsonProperty("region")
  @get:JsonProperty("region")
  public val region: String? = null,
)
