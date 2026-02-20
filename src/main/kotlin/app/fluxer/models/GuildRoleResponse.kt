package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class GuildRoleResponse(
  /**
   * The unique identifier for this role
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The name of the role
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * The colour of the role as an integer
   */
  @param:JsonProperty(
    "color",
    required = true,
  )
  @get:JsonProperty("color")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val color: Int,
  /**
   * The position of the role in the role hierarchy
   */
  @param:JsonProperty(
    "position",
    required = true,
  )
  @get:JsonProperty("position")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val position: Int,
  @param:JsonProperty("hoist_position")
  @get:JsonProperty("hoist_position")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val hoistPosition: Int? = null,
  /**
   * The permissions bitfield for the role
   */
  @param:JsonProperty("permissions")
  @get:JsonProperty("permissions")
  @get:NotNull
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val permissions: String,
  /**
   * Whether this role is displayed separately in the member list
   */
  @param:JsonProperty(
    "hoist",
    required = true,
  )
  @get:JsonProperty("hoist")
  @get:NotNull
  public val hoist: Boolean,
  /**
   * Whether this role can be mentioned by anyone
   */
  @param:JsonProperty(
    "mentionable",
    required = true,
  )
  @get:JsonProperty("mentionable")
  @get:NotNull
  public val mentionable: Boolean,
  @param:JsonProperty("unicode_emoji")
  @get:JsonProperty("unicode_emoji")
  public val unicodeEmoji: String? = null,
)
