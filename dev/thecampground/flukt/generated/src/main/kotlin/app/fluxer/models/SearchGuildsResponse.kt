package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.collections.List

public data class SearchGuildsResponse(
  @param:JsonProperty("guilds")
  @get:JsonProperty("guilds")
  @get:NotNull
  @get:Valid
  public val guilds: List<GuildAdminResponse>,
  @param:JsonProperty("total")
  @get:JsonProperty("total")
  @get:NotNull
  public val total: BigDecimal,
)
