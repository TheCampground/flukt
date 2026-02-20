package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

/**
 * Push notification configuration
 */
public data class WellKnownFluxerResponsePush(
  @param:JsonProperty("public_vapid_key")
  @get:JsonProperty("public_vapid_key")
  public val publicVapidKey: String?,
)
