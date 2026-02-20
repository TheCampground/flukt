package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class DeleteApiKeyResponse(
  @param:JsonProperty(
    "success",
    required = true,
  )
  @get:JsonProperty("success")
  @get:NotNull
  public val success: Boolean,
)
