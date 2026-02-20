package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class PhoneVerifyResponse(
  /**
   * Token to use when adding phone to account
   */
  @param:JsonProperty("phone_token")
  @get:JsonProperty("phone_token")
  @get:NotNull
  public val phoneToken: String,
)
