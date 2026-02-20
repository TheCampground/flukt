package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class DonationRequestLinkRequest(
  /**
   * Email address to send the magic link to
   */
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  @get:NotNull
  @get:Size(max = 254)
  public val email: String,
)
