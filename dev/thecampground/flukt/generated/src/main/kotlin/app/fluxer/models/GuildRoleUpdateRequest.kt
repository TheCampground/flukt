package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class GuildRoleUpdateRequest(
  /**
   * The name of the role (1-100 characters)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  /**
   * The color of the role as an integer
   */
  @param:JsonProperty("color")
  @get:JsonProperty("color")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "16777215",
    inclusive = true,
  )
  public val color: Int? = null,
  @param:JsonProperty("permissions")
  @get:JsonProperty("permissions")
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val permissions: String? = null,
  /**
   * Whether the role should be displayed separately in the member list
   */
  @param:JsonProperty("hoist")
  @get:JsonProperty("hoist")
  public val hoist: Boolean? = null,
  @param:JsonProperty("hoist_position")
  @get:JsonProperty("hoist_position")
  public val hoistPosition: Int? = null,
  /**
   * Whether the role can be mentioned by anyone
   */
  @param:JsonProperty("mentionable")
  @get:JsonProperty("mentionable")
  public val mentionable: Boolean? = null,
)
