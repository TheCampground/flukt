package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The current status of the scheduled message
 */
public enum class ScheduledMessageResponseSchemaStatus(
  @JsonValue
  public val `value`: String,
) {
  PENDING("pending"),
  INVALID("invalid"),
  SCHEDULED("scheduled"),
  SENT("sent"),
  FAILED("failed"),
  CANCELLED("cancelled"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, ScheduledMessageResponseSchemaStatus> =
        entries.associateBy(ScheduledMessageResponseSchemaStatus::value)

    public fun fromValue(`value`: String): ScheduledMessageResponseSchemaStatus? = mapping[value]
  }
}
