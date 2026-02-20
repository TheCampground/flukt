package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class CreateFavoriteMemeBodySchema(
  /**
   * Display name for the meme
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("alt_text")
  @get:JsonProperty("alt_text")
  public val altText: String? = null,
  @param:JsonProperty("tags")
  @get:JsonProperty("tags")
  public val tags: List<String>? = null,
  @param:JsonProperty("attachment_id")
  @get:JsonProperty("attachment_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val attachmentId: String? = null,
  @param:JsonProperty("embed_index")
  @get:JsonProperty("embed_index")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "9007199254740991",
    inclusive = true,
  )
  public val embedIndex: Long? = null,
)
