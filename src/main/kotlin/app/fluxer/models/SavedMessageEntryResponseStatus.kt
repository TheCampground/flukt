package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Availability status of the saved message
 */
public enum class SavedMessageEntryResponseStatus(
  @JsonValue
  public val `value`: String,
) {
  AVAILABLE("available"),
  MISSING_PERMISSIONS("missing_permissions"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, SavedMessageEntryResponseStatus> =
        entries.associateBy(SavedMessageEntryResponseStatus::value)

    public fun fromValue(`value`: String): SavedMessageEntryResponseStatus? = mapping[value]
  }
}
