package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class TenorRegisterShareRequest(
  /**
   * The Tenor result id
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  @param:JsonProperty("q")
  @get:JsonProperty("q")
  public val q: String? = null,
  /**
   * The locale code for the user interface language
   */
  @param:JsonProperty("locale")
  @get:JsonProperty("locale")
  public val locale: Locale? = null,
)
