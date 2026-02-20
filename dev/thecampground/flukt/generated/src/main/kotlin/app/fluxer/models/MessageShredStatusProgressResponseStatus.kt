package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Current message shred job status
 */
public enum class MessageShredStatusProgressResponseStatus(
  @JsonValue
  public val `value`: String,
) {
  IN_PROGRESS("in_progress"),
  COMPLETED("completed"),
  FAILED("failed"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageShredStatusProgressResponseStatus> =
        entries.associateBy(MessageShredStatusProgressResponseStatus::value)

    public fun fromValue(`value`: String): MessageShredStatusProgressResponseStatus? =
        mapping[value]
  }
}
