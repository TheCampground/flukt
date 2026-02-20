package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ClearGuildFieldsRequest(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * List of guild image fields to clear
   */
  @param:JsonProperty("fields")
  @get:JsonProperty("fields")
  @get:NotNull
  @get:Size(max = 10)
  public val fields: List<ClearGuildFieldsRequestFields>,
)
