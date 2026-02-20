package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String

public data class ChangeUsernameRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  @get:Pattern(regexp = "^[a-zA-Z0-9_]+${'$'}")
  @get:Size(
    min = 1,
    max = 32,
  )
  public val username: String,
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val discriminator: Int? = null,
)
