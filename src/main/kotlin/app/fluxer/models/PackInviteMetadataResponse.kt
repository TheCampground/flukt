package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class PackInviteMetadataResponse(
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
  public val pack: PackInviteMetadataResponsePack,
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
  /**
   * ISO8601 timestamp of when the invite was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: OffsetDateTime,
  /**
   * The number of times this invite has been used
   */
  @param:JsonProperty(
    "uses",
    required = true,
  )
  @get:JsonProperty("uses")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val uses: Int,
  /**
   * The maximum number of times this invite can be used
   */
  @param:JsonProperty(
    "max_uses",
    required = true,
  )
  @get:JsonProperty("max_uses")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val maxUses: Int,
)
