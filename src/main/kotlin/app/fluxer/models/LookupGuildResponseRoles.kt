package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class LookupGuildResponseRoles(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
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
  /**
   * The role permissions bitfield
   */
  @param:JsonProperty("permissions")
  @get:JsonProperty("permissions")
  @get:NotNull
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val permissions: String,
  @param:JsonProperty(
    "hoist",
    required = true,
  )
  @get:JsonProperty("hoist")
  @get:NotNull
  public val hoist: Boolean,
  @param:JsonProperty(
    "mentionable",
    required = true,
  )
  @get:JsonProperty("mentionable")
  @get:NotNull
  public val mentionable: Boolean,
)
