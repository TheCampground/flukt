package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.math.BigDecimal
import kotlin.String

public data class ListUserChangeLogRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * Maximum number of entries to return
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
  public val limit: BigDecimal? = null,
  /**
   * Pagination token for the next page of results
   */
  @param:JsonProperty("page_token")
  @get:JsonProperty("page_token")
  public val pageToken: String? = null,
)
