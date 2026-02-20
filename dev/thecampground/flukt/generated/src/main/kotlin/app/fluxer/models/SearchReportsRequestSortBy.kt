package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Field to sort reports by
 */
public enum class SearchReportsRequestSortBy(
  @JsonValue
  public val `value`: String,
) {
  CREATED_AT("createdAt"),
  REPORTED_AT("reportedAt"),
  RESOLVED_AT("resolvedAt"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, SearchReportsRequestSortBy> =
        entries.associateBy(SearchReportsRequestSortBy::value)

    public fun fromValue(`value`: String): SearchReportsRequestSortBy? = mapping[value]
  }
}
