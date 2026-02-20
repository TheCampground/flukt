package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class OkResponse(
  /**
   * Whether the operation was successful
   */
  @param:JsonProperty(
    "ok",
    required = true,
  )
  @get:JsonProperty("ok")
  @get:NotNull
  public val ok: Boolean,
)
