package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class ListIpBansResponseSchema(
  @param:JsonProperty("bans")
  @get:JsonProperty("bans")
  @get:NotNull
  @get:Size(max = 500)
  @get:Valid
  public val bans: List<IpBanListEntrySchema>,
)
