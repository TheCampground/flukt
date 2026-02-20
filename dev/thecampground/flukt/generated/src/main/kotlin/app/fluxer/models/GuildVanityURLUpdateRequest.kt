package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class GuildVanityURLUpdateRequest(
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  public val code: String? = null,
)
