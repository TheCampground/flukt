package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class UserNoteUpdateRequest(
  @param:JsonProperty("note")
  @get:JsonProperty("note")
  public val note: String? = null,
)
