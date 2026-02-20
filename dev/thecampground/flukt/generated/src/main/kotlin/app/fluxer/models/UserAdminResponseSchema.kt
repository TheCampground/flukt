package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class UserAdminResponseSchema(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  public val username: String,
  @param:JsonProperty(
    "discriminator",
    required = true,
  )
  @get:JsonProperty("discriminator")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val discriminator: Int,
  @param:JsonProperty("global_name")
  @get:JsonProperty("global_name")
  public val globalName: String?,
  @param:JsonProperty(
    "bot",
    required = true,
  )
  @get:JsonProperty("bot")
  @get:NotNull
  public val bot: Boolean,
  @param:JsonProperty(
    "system",
    required = true,
  )
  @get:JsonProperty("system")
  @get:NotNull
  public val system: Boolean,
  /**
   * A single user flag value to add or remove
   */
  @param:JsonProperty("flags")
  @get:JsonProperty("flags")
  @get:NotNull
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val flags: String,
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: String?,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String?,
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  public val bio: String?,
  @param:JsonProperty("pronouns")
  @get:JsonProperty("pronouns")
  public val pronouns: String?,
  @param:JsonProperty(
    "accent_color",
    required = true,
  )
  @get:JsonProperty("accent_color")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val accentColor: Int,
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  public val email: String?,
  @param:JsonProperty(
    "email_verified",
    required = true,
  )
  @get:JsonProperty("email_verified")
  @get:NotNull
  public val emailVerified: Boolean,
  @param:JsonProperty(
    "email_bounced",
    required = true,
  )
  @get:JsonProperty("email_bounced")
  @get:NotNull
  public val emailBounced: Boolean,
  @param:JsonProperty("phone")
  @get:JsonProperty("phone")
  public val phone: String?,
  @param:JsonProperty("date_of_birth")
  @get:JsonProperty("date_of_birth")
  public val dateOfBirth: String?,
  @param:JsonProperty("locale")
  @get:JsonProperty("locale")
  public val locale: String?,
  @param:JsonProperty(
    "premium_type",
    required = true,
  )
  @get:JsonProperty("premium_type")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val premiumType: Int,
  @param:JsonProperty("premium_since")
  @get:JsonProperty("premium_since")
  public val premiumSince: String?,
  @param:JsonProperty("premium_until")
  @get:JsonProperty("premium_until")
  public val premiumUntil: String?,
  /**
   * Bitmask of suspicious activity flags that triggered the disable
   */
  @param:JsonProperty(
    "suspicious_activity_flags",
    required = true,
  )
  @get:JsonProperty("suspicious_activity_flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val suspiciousActivityFlags: Int,
  @param:JsonProperty("temp_banned_until")
  @get:JsonProperty("temp_banned_until")
  public val tempBannedUntil: String?,
  @param:JsonProperty("pending_deletion_at")
  @get:JsonProperty("pending_deletion_at")
  public val pendingDeletionAt: String?,
  @param:JsonProperty("pending_bulk_message_deletion_at")
  @get:JsonProperty("pending_bulk_message_deletion_at")
  public val pendingBulkMessageDeletionAt: String?,
  @param:JsonProperty(
    "deletion_reason_code",
    required = true,
  )
  @get:JsonProperty("deletion_reason_code")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val deletionReasonCode: Int,
  @param:JsonProperty("deletion_public_reason")
  @get:JsonProperty("deletion_public_reason")
  public val deletionPublicReason: String?,
  @param:JsonProperty("acls")
  @get:JsonProperty("acls")
  @get:NotNull
  @get:Size(max = 100)
  public val acls: List<String>,
  @param:JsonProperty("traits")
  @get:JsonProperty("traits")
  @get:NotNull
  @get:Size(max = 100)
  public val traits: List<String>,
  @param:JsonProperty(
    "has_totp",
    required = true,
  )
  @get:JsonProperty("has_totp")
  @get:NotNull
  public val hasTotp: Boolean,
  @param:JsonProperty("authenticator_types")
  @get:JsonProperty("authenticator_types")
  @get:NotNull
  @get:Size(max = 10)
  public val authenticatorTypes: List<Int>,
  @param:JsonProperty("last_active_at")
  @get:JsonProperty("last_active_at")
  public val lastActiveAt: String?,
  @param:JsonProperty("last_active_ip")
  @get:JsonProperty("last_active_ip")
  public val lastActiveIp: String?,
  @param:JsonProperty("last_active_ip_reverse")
  @get:JsonProperty("last_active_ip_reverse")
  public val lastActiveIpReverse: String?,
  @param:JsonProperty("last_active_location")
  @get:JsonProperty("last_active_location")
  public val lastActiveLocation: String?,
)
