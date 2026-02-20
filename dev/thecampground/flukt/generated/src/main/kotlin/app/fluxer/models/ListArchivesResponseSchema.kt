package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.collections.List

public data class ListArchivesResponseSchema(
  @param:JsonProperty("archives")
  @get:JsonProperty("archives")
  @get:NotNull
  @get:Valid
  public val archives: List<AdminArchiveResponseSchema>,
)
