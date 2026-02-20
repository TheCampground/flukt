package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class RelationshipNicknameUpdateRequest(
  @param:JsonProperty("nickname")
  @get:JsonProperty("nickname")
  public val nickname: String?,
)
