package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid

public data class LookupGuildResponse(
  @param:JsonProperty("guild")
  @get:JsonProperty("guild")
  @get:Valid
  public val guild: LookupGuildResponseGuild?,
)
