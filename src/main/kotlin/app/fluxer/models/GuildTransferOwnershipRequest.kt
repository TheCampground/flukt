package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String

public data class GuildTransferOwnershipRequest(
  @param:JsonProperty("new_owner_id")
  @get:JsonProperty("new_owner_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val newOwnerId: String,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String? = null,
)
