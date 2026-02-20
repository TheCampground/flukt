package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class BulkUpdateUserFlagsRequest(
  /**
   * List of user IDs to update
   */
  @param:JsonProperty("user_ids")
  @get:JsonProperty("user_ids")
  @get:NotNull
  @get:Size(max = 1_000)
  public val userIds: List<String>,
  /**
   * User flags to add to all specified users
   */
  @param:JsonProperty("add_flags")
  @get:JsonProperty("add_flags")
  @get:Size(max = 64)
  public val addFlags: List<String>? = null,
  /**
   * User flags to remove from all specified users
   */
  @param:JsonProperty("remove_flags")
  @get:JsonProperty("remove_flags")
  @get:Size(max = 64)
  public val removeFlags: List<String>? = null,
)
