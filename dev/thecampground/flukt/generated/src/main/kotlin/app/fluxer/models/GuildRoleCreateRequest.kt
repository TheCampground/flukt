package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class GuildRoleCreateRequest(
  /**
   * The name of the role (1-100 characters)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * The color of the role as an integer (default: 0)
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
)
