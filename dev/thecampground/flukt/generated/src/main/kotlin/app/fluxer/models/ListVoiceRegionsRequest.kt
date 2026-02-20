package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean

public data class ListVoiceRegionsRequest(
  /**
   * Whether to include voice servers in the response
   */
  @param:JsonProperty("include_servers")
  @get:JsonProperty("include_servers")
  public val includeServers: Boolean? = null,
)
