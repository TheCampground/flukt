package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class RtcRegionResponse(
  /**
   * The unique identifier for this RTC region
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * The display name of the RTC region
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * The emoji associated with this RTC region
   */
  @param:JsonProperty("emoji")
  @get:JsonProperty("emoji")
  @get:NotNull
  public val emoji: String,
)
