package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class TicketResponse(
  /**
   * A temporary ticket token for subsequent operations
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
)
