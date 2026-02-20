package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of report
 */
public enum class DsaReportGuildRequestReportType(
  @JsonValue
  public val `value`: String,
) {
  GUILD("guild"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, DsaReportGuildRequestReportType> =
        entries.associateBy(DsaReportGuildRequestReportType::value)

    public fun fromValue(`value`: String): DsaReportGuildRequestReportType? = mapping[value]
  }
}
