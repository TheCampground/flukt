package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class GetVoiceServerRequest(
  /**
   * ID of the region the server belongs to
   */
  @param:JsonProperty("region_id")
  @get:JsonProperty("region_id")
  @get:NotNull
  public val regionId: String,
  /**
   * ID of the voice server to retrieve
   */
  @param:JsonProperty("server_id")
  @get:JsonProperty("server_id")
  @get:NotNull
  public val serverId: String,
)
