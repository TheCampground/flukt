package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class CreateSystemDmJobRequest(
  /**
   * Message content to send to users
   */
  @param:JsonProperty("content")
  @get:JsonProperty("content")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 4_000,
  )
  public val content: String,
  @param:JsonProperty("registration_start")
  @get:JsonProperty("registration_start")
  public val registrationStart: String? = null,
  @param:JsonProperty("registration_end")
  @get:JsonProperty("registration_end")
  public val registrationEnd: String? = null,
  /**
   * Guild IDs whose members should be excluded
   */
  @param:JsonProperty("excluded_guild_ids")
  @get:JsonProperty("excluded_guild_ids")
  @get:Size(max = 100)
  public val excludedGuildIds: List<String>? = null,
)
