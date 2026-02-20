package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class SetUserTraitsRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * List of traits to assign to the user
   */
  @param:JsonProperty("traits")
  @get:JsonProperty("traits")
  @get:NotNull
  @get:Size(max = 100)
  public val traits: List<String>,
)
