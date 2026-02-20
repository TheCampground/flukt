package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

public data class GuildAssetItemSchema(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty(
    "animated",
    required = true,
  )
  @get:JsonProperty("animated")
  @get:NotNull
  public val animated: Boolean,
  @param:JsonProperty("creator_id")
  @get:JsonProperty("creator_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val creatorId: String,
  @param:JsonProperty("media_url")
  @get:JsonProperty("media_url")
  @get:NotNull
  public val mediaUrl: String,
)
