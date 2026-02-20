package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * NCMEC submission status
 */
public enum class NcmecSubmissionStatusResponseStatus(
  @JsonValue
  public val `value`: String,
) {
  NOT_SUBMITTED("not_submitted"),
  SUBMITTED("submitted"),
  FAILED("failed"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, NcmecSubmissionStatusResponseStatus> =
        entries.associateBy(NcmecSubmissionStatusResponseStatus::value)

    public fun fromValue(`value`: String): NcmecSubmissionStatusResponseStatus? = mapping[value]
  }
}
