package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class LegalHoldResponse(
  @param:JsonProperty(
    "held",
    required = true,
  )
  @get:JsonProperty("held")
  @get:NotNull
  public val held: Boolean,
)
