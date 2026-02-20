package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of report
 */
public enum class DsaReportUserRequestReportType(
  @JsonValue
  public val `value`: String,
) {
  USER("user"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, DsaReportUserRequestReportType> =
        entries.associateBy(DsaReportUserRequestReportType::value)

    public fun fromValue(`value`: String): DsaReportUserRequestReportType? = mapping[value]
  }
}
