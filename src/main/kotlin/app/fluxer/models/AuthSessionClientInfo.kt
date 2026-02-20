package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import kotlin.String

public data class AuthSessionClientInfo(
  @param:JsonProperty("platform")
  @get:JsonProperty("platform")
  public val platform: String? = null,
  @param:JsonProperty("os")
  @get:JsonProperty("os")
  public val os: String? = null,
  @param:JsonProperty("browser")
  @get:JsonProperty("browser")
  public val browser: String? = null,
  @param:JsonProperty("location")
  @get:JsonProperty("location")
  @get:Valid
  public val location: AuthSessionLocation? = null,
)
