package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class PackInviteResponse(
  /**
   * The unique invite code
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * The type of pack invite (emoji or sticker pack)
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  /**
   * The pack this invite is for
   */
  @param:JsonProperty("pack")
  @get:JsonProperty("pack")
  @get:NotNull
  @get:Valid
  public val pack: PackInviteResponsePack,
  @param:JsonProperty("inviter")
  @get:JsonProperty("inviter")
  @get:Valid
  public val inviter: UserPartialResponse? = null,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: OffsetDateTime? = null,
  /**
   * Whether the invite grants temporary access
   */
  @param:JsonProperty(
    "temporary",
    required = true,
  )
  @get:JsonProperty("temporary")
  @get:NotNull
  public val temporary: Boolean,
)
