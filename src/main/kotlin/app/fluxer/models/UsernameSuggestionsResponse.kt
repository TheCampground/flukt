package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class UsernameSuggestionsResponse(
  /**
   * List of suggested usernames
   */
  @param:JsonProperty("suggestions")
  @get:JsonProperty("suggestions")
  @get:NotNull
  @get:Size(max = 20)
  public val suggestions: List<String>,
)
