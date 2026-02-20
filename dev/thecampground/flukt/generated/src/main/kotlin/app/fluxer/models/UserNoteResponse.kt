package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class UserNoteResponse(
  /**
   * The note text for this user
   */
  @param:JsonProperty("note")
  @get:JsonProperty("note")
  @get:NotNull
  public val note: String,
)
