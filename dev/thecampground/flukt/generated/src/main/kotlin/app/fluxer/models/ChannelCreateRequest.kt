package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Any

public data class ChannelCreateRequest(
  @param:JsonProperty("oneOf")
  @get:JsonProperty("oneOf")
  public val oneOf: Any? = null,
)
