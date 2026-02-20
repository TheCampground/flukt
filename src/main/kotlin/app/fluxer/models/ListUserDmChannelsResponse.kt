package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class ListUserDmChannelsResponse(
  @param:JsonProperty("channels")
  @get:JsonProperty("channels")
  @get:NotNull
  @get:Size(max = 200)
  @get:Valid
  public val channels: List<AdminUserDmChannelSchema>,
)
