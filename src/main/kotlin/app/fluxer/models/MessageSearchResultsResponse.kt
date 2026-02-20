package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.collections.List

public data class MessageSearchResultsResponse(
  /**
   * The messages matching the search query
   */
  @param:JsonProperty("messages")
  @get:JsonProperty("messages")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val messages: List<MessageSearchResultsResponseMessages>,
  /**
   * The total number of messages matching the search
   */
  @param:JsonProperty(
    "total",
    required = true,
  )
  @get:JsonProperty("total")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val total: Int,
  /**
   * The maximum number of messages returned per page
   */
  @param:JsonProperty(
    "hits_per_page",
    required = true,
  )
  @get:JsonProperty("hits_per_page")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val hitsPerPage: Int,
  /**
   * The current page number
   */
  @param:JsonProperty(
    "page",
    required = true,
  )
  @get:JsonProperty("page")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val page: Int,
)
