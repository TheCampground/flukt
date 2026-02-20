package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class RefreshSearchIndexRequest(
  /**
   * Type of search index to refresh
   */
  @param:JsonProperty("index_type")
  @get:JsonProperty("index_type")
  @get:NotNull
  public val indexType: RefreshSearchIndexRequestIndexType,
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String? = null,
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String? = null,
)
