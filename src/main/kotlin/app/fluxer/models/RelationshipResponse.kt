package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String

public data class RelationshipResponse(
  /**
   * The unique identifier for the relationship
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * Relationship type
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: UserPartialResponse,
  /**
   * ISO8601 timestamp of when the relationship was established
   */
  @param:JsonProperty("since")
  @get:JsonProperty("since")
  public val since: OffsetDateTime? = null,
  @param:JsonProperty("nickname")
  @get:JsonProperty("nickname")
  public val nickname: String?,
)
