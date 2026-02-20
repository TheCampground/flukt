package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class ListUserDmChannelsRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  @param:JsonProperty("before")
  @get:JsonProperty("before")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val before: String? = null,
  @param:JsonProperty("after")
  @get:JsonProperty("after")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val after: String? = null,
  /**
   * Maximum number of DM channels to return
   */
  @param:JsonProperty("limit")
  @get:JsonProperty("limit")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "200",
    inclusive = true,
  )
  public val limit: Int? = null,
)
