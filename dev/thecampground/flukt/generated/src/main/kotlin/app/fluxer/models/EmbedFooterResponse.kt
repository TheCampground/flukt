package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import java.net.URI
import kotlin.String

public data class EmbedFooterResponse(
  /**
   * The footer text
   */
  @param:JsonProperty("text")
  @get:JsonProperty("text")
  @get:NotNull
  public val text: String,
  @param:JsonProperty("icon_url")
  @get:JsonProperty("icon_url")
  public val iconUrl: URI? = null,
  @param:JsonProperty("proxy_icon_url")
  @get:JsonProperty("proxy_icon_url")
  public val proxyIconUrl: URI? = null,
)
