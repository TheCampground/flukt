package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class GuildMemberSearchResponse(
  /**
   * Guild ID
   */
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  public val guildId: String,
  /**
   * Matching members
   */
  @param:JsonProperty("members")
  @get:JsonProperty("members")
  @get:NotNull
  @get:Valid
  public val members: List<GuildMemberSearchResult>,
  /**
   * Number of results in this page
   */
  @param:JsonProperty(
    "page_result_count",
    required = true,
  )
  @get:JsonProperty("page_result_count")
  @get:NotNull
  public val pageResultCount: Int,
  /**
   * Total number of matching results
   */
  @param:JsonProperty(
    "total_result_count",
    required = true,
  )
  @get:JsonProperty("total_result_count")
  @get:NotNull
  public val totalResultCount: Int,
  /**
   * Whether the guild members are currently being indexed
   */
  @param:JsonProperty(
    "indexing",
    required = true,
  )
  @get:JsonProperty("indexing")
  @get:NotNull
  public val indexing: Boolean,
)
