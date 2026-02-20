package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import java.net.URI
import kotlin.String

public data class EmbedAuthorResponse(
  /**
   * The name of the author
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  public val url: URI? = null,
  @param:JsonProperty("icon_url")
  @get:JsonProperty("icon_url")
  public val iconUrl: URI? = null,
  @param:JsonProperty("proxy_icon_url")
  @get:JsonProperty("proxy_icon_url")
  public val proxyIconUrl: URI? = null,
)
