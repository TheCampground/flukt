package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String

public data class FriendRequestByTagRequest(
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  @get:Pattern(regexp = "^[a-zA-Z0-9_]+${'$'}")
  @get:Size(
    min = 1,
    max = 32,
  )
  public val username: String,
  /**
   * Discriminator tag of the user
   */
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:NotNull
  @get:Pattern(regexp = "^\\d{1,4}${'$'}")
  public val discriminator: String,
)
