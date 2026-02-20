package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

public data class GuildUpdateResponse(
  @param:JsonProperty("guild")
  @get:JsonProperty("guild")
  @get:NotNull
  @get:Valid
  public val guild: GuildUpdateResponseGuild,
)
