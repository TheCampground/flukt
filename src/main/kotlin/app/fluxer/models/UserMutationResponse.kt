package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

public data class UserMutationResponse(
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: UserAdminResponseSchema,
)
