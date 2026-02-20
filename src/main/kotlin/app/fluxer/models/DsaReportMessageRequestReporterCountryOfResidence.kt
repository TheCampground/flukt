package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * EU country code of the reporter residence
 */
public enum class DsaReportMessageRequestReporterCountryOfResidence(
  @JsonValue
  public val `value`: String,
) {
  AT("AT"),
  BE("BE"),
  BG("BG"),
  HR("HR"),
  CY("CY"),
  CZ("CZ"),
  DK("DK"),
  EE("EE"),
  FI("FI"),
  FR("FR"),
  DE("DE"),
  GR("GR"),
  HU("HU"),
  IE("IE"),
  IT("IT"),
  LV("LV"),
  LT("LT"),
  LU("LU"),
  MT("MT"),
  NL("NL"),
  PL("PL"),
  PT("PT"),
  RO("RO"),
  SK("SK"),
  SI("SI"),
  ES("ES"),
  SE("SE"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, DsaReportMessageRequestReporterCountryOfResidence> =
        entries.associateBy(DsaReportMessageRequestReporterCountryOfResidence::value)

    public fun fromValue(`value`: String): DsaReportMessageRequestReporterCountryOfResidence? =
        mapping[value]
  }
}
