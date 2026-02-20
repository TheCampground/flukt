package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class LookupUserByIdsRequest(
  @param:JsonProperty("user_ids")
  @get:JsonProperty("user_ids")
  @get:NotNull
  @get:Size(max = 100)
  public val userIds: List<String>,
)
