package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String

public data class MfaBackupCodeResponse(
  /**
   * The backup code
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * Whether the code has been used
   */
  @param:JsonProperty(
    "consumed",
    required = true,
  )
  @get:JsonProperty("consumed")
  @get:NotNull
  public val consumed: Boolean,
)
