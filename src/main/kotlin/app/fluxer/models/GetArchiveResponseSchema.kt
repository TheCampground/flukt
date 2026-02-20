package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid

public data class GetArchiveResponseSchema(
  @param:JsonProperty("archive")
  @get:JsonProperty("archive")
  @get:Valid
  public val archive: AdminArchiveResponseSchema?,
)
