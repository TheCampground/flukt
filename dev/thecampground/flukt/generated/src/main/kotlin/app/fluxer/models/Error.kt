package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.String
import kotlin.collections.List

public data class Error(
  /**
   * Error codes returned by API operations
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: APIErrorCode,
  /**
   * Human-readable error message
   */
  @param:JsonProperty("message")
  @get:JsonProperty("message")
  @get:NotNull
  public val message: String,
  /**
   * Field-specific validation errors
   */
  @param:JsonProperty("errors")
  @get:JsonProperty("errors")
  @get:Valid
  public val errors: List<ValidationErrorItem>? = null,
)
