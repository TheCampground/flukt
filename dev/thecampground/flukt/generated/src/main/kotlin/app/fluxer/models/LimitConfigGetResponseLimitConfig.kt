package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.String
import kotlin.collections.List

public data class LimitConfigGetResponseLimitConfig(
  @param:JsonProperty("traitDefinitions")
  @get:JsonProperty("traitDefinitions")
  @get:NotNull
  public val traitDefinitions: List<String>,
  @param:JsonProperty("rules")
  @get:JsonProperty("rules")
  @get:NotNull
  @get:Valid
  public val rules: List<LimitConfigGetResponseRules>,
)
