package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class AuthSessionLocation(
  @param:JsonProperty("city")
  @get:JsonProperty("city")
  public val city: String? = null,
  @param:JsonProperty("region")
  @get:JsonProperty("region")
  public val region: String? = null,
  @param:JsonProperty("country")
  @get:JsonProperty("country")
  public val country: String? = null,
)
