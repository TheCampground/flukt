package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class ChangeDobRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * New date of birth in YYYY-MM-DD format
   */
  @param:JsonProperty("date_of_birth")
  @get:JsonProperty("date_of_birth")
  @get:NotNull
  public val dateOfBirth: String,
)
