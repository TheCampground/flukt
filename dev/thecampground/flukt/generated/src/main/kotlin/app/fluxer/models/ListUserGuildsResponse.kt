package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class ListUserGuildsResponse(
  @param:JsonProperty("guilds")
  @get:JsonProperty("guilds")
  @get:NotNull
  @get:Size(max = 200)
  @get:Valid
  public val guilds: List<GuildAdminResponse>,
)
