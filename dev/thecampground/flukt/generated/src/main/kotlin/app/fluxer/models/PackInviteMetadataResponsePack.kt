package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.time.OffsetDateTime
import kotlin.String

/**
 * The pack this invite is for
 */
public data class PackInviteMetadataResponsePack(
  /**
   * The unique identifier for the pack
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The display name of the pack
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String? = null,
  /**
   * The type of pack (emoji or sticker)
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  @get:NotNull
  public val type: PackType,
  /**
   * The ID of the user who created the pack
   */
  @param:JsonProperty("creator_id")
  @get:JsonProperty("creator_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val creatorId: String,
  /**
   * ISO8601 timestamp of when the pack was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: OffsetDateTime,
  /**
   * ISO8601 timestamp of when the pack was last updated
   */
  @param:JsonProperty("updated_at")
  @get:JsonProperty("updated_at")
  @get:NotNull
  public val updatedAt: OffsetDateTime,
  @param:JsonProperty("creator")
  @get:JsonProperty("creator")
  @get:NotNull
  @get:Valid
  public val creator: UserPartialResponse,
)
