package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Any
import kotlin.Int
import kotlin.String

public data class LookupGuildResponseChannels(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: Any,
  /**
   * The type of the channel
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
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
  @param:JsonProperty("parent_id")
  @get:JsonProperty("parent_id")
  @get:NotNull
  public val parentId: Any,
)
