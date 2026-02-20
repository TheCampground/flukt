package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ReloadGuildsRequest(
  /**
   * List of guild IDs to reload
   */
  @param:JsonProperty("guild_ids")
  @get:JsonProperty("guild_ids")
  @get:NotNull
  @get:Size(max = 1_000)
  public val guildIds: List<String>,
)
