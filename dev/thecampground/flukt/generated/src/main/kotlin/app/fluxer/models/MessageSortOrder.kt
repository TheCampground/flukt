package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The order to sort search results
 */
public enum class MessageSortOrder(
  @JsonValue
  public val `value`: String,
) {
  ASC("asc"),
  DESC("desc"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageSortOrder> =
        entries.associateBy(MessageSortOrder::value)

    public fun fromValue(`value`: String): MessageSortOrder? = mapping[value]
  }
}
