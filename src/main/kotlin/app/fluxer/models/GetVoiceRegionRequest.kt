package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String

public data class GetVoiceRegionRequest(
  /**
   * ID of the voice region to retrieve
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * Whether to include voice servers in the response
   */
  @param:JsonProperty("include_servers")
  @get:JsonProperty("include_servers")
  public val includeServers: Boolean? = null,
)
