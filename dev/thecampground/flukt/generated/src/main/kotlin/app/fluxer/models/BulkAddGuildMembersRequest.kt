package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class BulkAddGuildMembersRequest(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * List of user IDs to add as members
   */
  @param:JsonProperty("user_ids")
  @get:JsonProperty("user_ids")
  @get:NotNull
  @get:Size(max = 1_000)
  public val userIds: List<String>,
)
