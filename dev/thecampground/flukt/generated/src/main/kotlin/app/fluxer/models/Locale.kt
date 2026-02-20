package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The locale code for the user interface language
 */
public enum class Locale(
  @JsonValue
  public val `value`: String,
) {
  AR("ar"),
  BG("bg"),
  CS("cs"),
  DA("da"),
  DE("de"),
  EL("el"),
  EN_GB("en-GB"),
  EN_US("en-US"),
  ES_ES("es-ES"),
  ES_419("es-419"),
  FI("fi"),
  FR("fr"),
  HE("he"),
  HI("hi"),
  HR("hr"),
  HU("hu"),
  ID("id"),
  IT("it"),
  JA("ja"),
  KO("ko"),
  LT("lt"),
  NL("nl"),
  NO("no"),
  PL("pl"),
  PT_BR("pt-BR"),
  RO("ro"),
  RU("ru"),
  SV_SE("sv-SE"),
  TH("th"),
  TR("tr"),
  UK("uk"),
  VI("vi"),
  ZH_CN("zh-CN"),
  ZH_TW("zh-TW"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, Locale> = entries.associateBy(Locale::value)

    public fun fromValue(`value`: String): Locale? = mapping[value]
  }
}
