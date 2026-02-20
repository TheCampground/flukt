package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class MessageSearchIndexingResponse(
  /**
   * Indicates that one or more channels are being indexed
   */
  @param:JsonProperty(
    "indexing",
    required = true,
  )
  @get:JsonProperty("indexing")
  @get:NotNull
  public val indexing: Boolean,
)
