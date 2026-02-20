package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class BanIpRequest(
  /**
   * IPv4/IPv6 address or CIDR range to ban
   */
  @param:JsonProperty("ip")
  @get:JsonProperty("ip")
  @get:NotNull
  public val ip: String,
)
