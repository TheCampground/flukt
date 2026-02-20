package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class UserTagCheckResponse(
  /**
   * Whether the username/discriminator combination is already taken
   */
  @param:JsonProperty(
    "taken",
    required = true,
  )
  @get:JsonProperty("taken")
  @get:NotNull
  public val taken: Boolean,
)
