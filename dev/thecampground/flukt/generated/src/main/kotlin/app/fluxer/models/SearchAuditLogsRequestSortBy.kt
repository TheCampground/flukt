package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Field to sort audit logs by
 */
public enum class SearchAuditLogsRequestSortBy(
  @JsonValue
  public val `value`: String,
) {
  CREATED_AT("createdAt"),
  RELEVANCE("relevance"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, SearchAuditLogsRequestSortBy> =
        entries.associateBy(SearchAuditLogsRequestSortBy::value)

    public fun fromValue(`value`: String): SearchAuditLogsRequestSortBy? = mapping[value]
  }
}
