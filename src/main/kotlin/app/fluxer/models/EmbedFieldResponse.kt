package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String

public data class EmbedFieldResponse(
  /**
   * The name of the field
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * The value of the field
   */
  @param:JsonProperty("value")
  @get:JsonProperty("value")
  @get:NotNull
  public val `value`: String,
  /**
   * Whether the field should be displayed inline
   */
  @param:JsonProperty(
    "inline",
    required = true,
  )
  @get:JsonProperty("inline")
  @get:NotNull
  public val `inline`: Boolean,
)
