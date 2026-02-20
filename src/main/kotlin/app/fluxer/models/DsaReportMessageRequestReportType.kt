package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of report
 */
public enum class DsaReportMessageRequestReportType(
  @JsonValue
  public val `value`: String,
) {
  MESSAGE("message"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, DsaReportMessageRequestReportType> =
        entries.associateBy(DsaReportMessageRequestReportType::value)

    public fun fromValue(`value`: String): DsaReportMessageRequestReportType? = mapping[value]
  }
}
