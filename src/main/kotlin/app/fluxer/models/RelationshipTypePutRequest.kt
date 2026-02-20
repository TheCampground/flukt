package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Int

public data class RelationshipTypePutRequest(
  /**
   * Relationship type
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  public val type: Int? = null,
)
