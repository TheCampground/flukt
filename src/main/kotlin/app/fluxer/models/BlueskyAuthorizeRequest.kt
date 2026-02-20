package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class BlueskyAuthorizeRequest(
  /**
   * The Bluesky handle to connect (e.g. alice.bsky.social)
   */
  @param:JsonProperty("handle")
  @get:JsonProperty("handle")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 253,
  )
  public val handle: String,
)
