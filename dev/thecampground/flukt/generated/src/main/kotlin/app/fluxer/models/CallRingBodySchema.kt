package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.collections.List

public data class CallRingBodySchema(
  /**
   * User IDs to ring for the call
   */
  @param:JsonProperty("recipients")
  @get:JsonProperty("recipients")
  public val recipients: List<String>? = null,
)
