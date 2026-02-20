package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Current status of the system DM job
 */
public enum class SystemDmJobResponseStatus(
  @JsonValue
  public val `value`: String,
) {
  PENDING("pending"),
  APPROVED("approved"),
  RUNNING("running"),
  COMPLETED("completed"),
  FAILED("failed"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, SystemDmJobResponseStatus> =
        entries.associateBy(SystemDmJobResponseStatus::value)

    public fun fromValue(`value`: String): SystemDmJobResponseStatus? = mapping[value]
  }
}
