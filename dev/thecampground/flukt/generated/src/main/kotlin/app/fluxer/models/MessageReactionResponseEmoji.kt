package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

/**
 * The emoji used for the reaction
 */
public data class MessageReactionResponseEmoji(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String? = null,
  /**
   * The name of the emoji (or Unicode character for standard emojis)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("animated")
  @get:JsonProperty("animated")
  public val animated: Boolean? = null,
)
