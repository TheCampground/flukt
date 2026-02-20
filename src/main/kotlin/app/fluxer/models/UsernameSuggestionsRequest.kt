package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class UsernameSuggestionsRequest(
  /**
   * Display name to generate username suggestions from
   */
  @param:JsonProperty("global_name")
  @get:JsonProperty("global_name")
  @get:NotNull
  public val globalName: String,
)
