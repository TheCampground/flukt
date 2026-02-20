package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import kotlin.Boolean
import kotlin.Int

public data class MessageAckRequest(
  @param:JsonProperty("mention_count")
  @get:JsonProperty("mention_count")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val mentionCount: Int? = null,
  /**
   * Whether this is a manual acknowledgement
   */
  @param:JsonProperty("manual")
  @get:JsonProperty("manual")
  public val manual: Boolean? = null,
)
