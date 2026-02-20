package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class IpBanListEntrySchema(
  /**
   * Banned IPv4/IPv6 address or CIDR range
   */
  @param:JsonProperty("ip")
  @get:JsonProperty("ip")
  @get:NotNull
  public val ip: String,
  @param:JsonProperty("reverse_dns")
  @get:JsonProperty("reverse_dns")
  public val reverseDns: String?,
)
