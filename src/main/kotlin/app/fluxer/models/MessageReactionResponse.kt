package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int

public data class MessageReactionResponse(
  /**
   * The emoji used for the reaction
   */
  @param:JsonProperty("emoji")
  @get:JsonProperty("emoji")
  @get:NotNull
  @get:Valid
  public val emoji: MessageReactionResponseEmoji,
  /**
   * The total number of times this reaction has been used
   */
  @param:JsonProperty(
    "count",
    required = true,
  )
  @get:JsonProperty("count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val count: Int,
  @param:JsonProperty("me")
  @get:JsonProperty("me")
  public val me: Boolean? = null,
)
