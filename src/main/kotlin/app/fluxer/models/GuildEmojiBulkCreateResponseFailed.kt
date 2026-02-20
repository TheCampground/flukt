package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

/**
 * Emojis that failed to create
 */
public data class GuildEmojiBulkCreateResponseFailed(
  /**
   * The name of the emoji that failed to create
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * The error message explaining why the emoji failed to create
   */
  @param:JsonProperty("error")
  @get:JsonProperty("error")
  @get:NotNull
  public val error: String,
)
