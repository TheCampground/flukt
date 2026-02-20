package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class UpdateUserFlagsRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * User flags to add
   */
  @param:JsonProperty("add_flags")
  @get:JsonProperty("add_flags")
  @get:Size(max = 64)
  public val addFlags: List<String>? = null,
  /**
   * User flags to remove
   */
  @param:JsonProperty("remove_flags")
  @get:JsonProperty("remove_flags")
  @get:Size(max = 64)
  public val removeFlags: List<String>? = null,
)
