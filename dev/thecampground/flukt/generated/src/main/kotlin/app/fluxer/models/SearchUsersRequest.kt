package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class SearchUsersRequest(
  @param:JsonProperty("query")
  @get:JsonProperty("query")
  public val query: String? = null,
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
  @param:JsonProperty("offset")
  @get:JsonProperty("offset")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "9007199254740991",
    inclusive = true,
  )
  public val offset: Long? = null,
)
