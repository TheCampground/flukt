package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class BanCheckResponseSchema(
  @param:JsonProperty(
    "banned",
    required = true,
  )
  @get:JsonProperty("banned")
  @get:NotNull
  public val banned: Boolean,
)
