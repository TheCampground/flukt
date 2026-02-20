package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Sort order direction
 */
public enum class SearchReportsRequestSortOrder(
  @JsonValue
  public val `value`: String,
) {
  ASC("asc"),
  DESC("desc"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, SearchReportsRequestSortOrder> =
        entries.associateBy(SearchReportsRequestSortOrder::value)

    public fun fromValue(`value`: String): SearchReportsRequestSortOrder? = mapping[value]
  }
}
