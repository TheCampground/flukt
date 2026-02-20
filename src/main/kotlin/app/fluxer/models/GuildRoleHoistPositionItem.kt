package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class GuildRoleHoistPositionItem(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The new hoist position for the role
   */
  @param:JsonProperty(
    "hoist_position",
    required = true,
  )
  @get:JsonProperty("hoist_position")
  @get:NotNull
  public val hoistPosition: Int,
)
