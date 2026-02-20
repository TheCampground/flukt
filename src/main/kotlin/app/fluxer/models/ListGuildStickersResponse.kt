package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ListGuildStickersResponse(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  @param:JsonProperty("stickers")
  @get:JsonProperty("stickers")
  @get:NotNull
  @get:Size(max = 500)
  @get:Valid
  public val stickers: List<GuildAssetItemSchema>,
)
