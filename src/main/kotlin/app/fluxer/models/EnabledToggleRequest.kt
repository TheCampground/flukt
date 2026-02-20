package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class EnabledToggleRequest(
  /**
   * Whether to enable or disable the feature
   */
  @param:JsonProperty(
    "enabled",
    required = true,
  )
  @get:JsonProperty("enabled")
  @get:NotNull
  public val enabled: Boolean,
)
