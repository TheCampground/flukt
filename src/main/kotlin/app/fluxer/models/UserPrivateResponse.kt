package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class UserPrivateResponse(
  /**
   * The unique identifier (snowflake) for this user
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The username of the user, not unique across the platform
   */
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  public val username: String,
  /**
   * The four-digit discriminator tag of the user
   */
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:NotNull
  public val discriminator: String,
  @param:JsonProperty("global_name")
  @get:JsonProperty("global_name")
  public val globalName: String?,
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: String?,
  @param:JsonProperty(
    "avatar_color",
    required = true,
  )
  @get:JsonProperty("avatar_color")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val avatarColor: Int,
  /**
   * Whether the user is a bot account
   */
  @param:JsonProperty("bot")
  @get:JsonProperty("bot")
  public val bot: Boolean? = null,
  /**
   * Whether the user is an official system user
   */
  @param:JsonProperty("system")
  @get:JsonProperty("system")
  public val system: Boolean? = null,
  /**
   * The public flags on the user account
   */
  @param:JsonProperty(
    "flags",
    required = true,
  )
  @get:JsonProperty("flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val flags: Int,
  /**
   * Whether the user has staff permissions
   */
  @param:JsonProperty(
    "is_staff",
    required = true,
  )
  @get:JsonProperty("is_staff")
  @get:NotNull
  public val isStaff: Boolean,
  /**
   * Access control list entries for the user
   */
  @param:JsonProperty("acls")
  @get:JsonProperty("acls")
  @get:NotNull
  @get:Size(max = 100)
  public val acls: List<String>,
  /**
   * Special traits assigned to the user account
   */
  @param:JsonProperty("traits")
  @get:JsonProperty("traits")
  @get:NotNull
  @get:Size(max = 100)
  public val traits: List<String>,
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  public val email: String?,
  /**
   * Whether the current email address is marked as bounced by the mail provider
   */
  @param:JsonProperty("email_bounced")
  @get:JsonProperty("email_bounced")
  public val emailBounced: Boolean? = null,
  @param:JsonProperty("phone")
  @get:JsonProperty("phone")
  public val phone: String?,
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
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String?,
  @param:JsonProperty(
    "banner_color",
    required = true,
  )
  @get:JsonProperty("banner_color")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val bannerColor: Int,
  /**
   * Whether multi-factor authentication is enabled
   */
  @param:JsonProperty(
    "mfa_enabled",
    required = true,
  )
  @get:JsonProperty("mfa_enabled")
  @get:NotNull
  public val mfaEnabled: Boolean,
  /**
   * The types of authenticators configured for MFA
   */
  @param:JsonProperty("authenticator_types")
  @get:JsonProperty("authenticator_types")
  @get:Size(max = 10)
  public val authenticatorTypes: List<Int>? = null,
  /**
   * Whether the email address has been verified
   */
  @param:JsonProperty(
    "verified",
    required = true,
  )
  @get:JsonProperty("verified")
  @get:NotNull
  public val verified: Boolean,
  /**
   * Premium subscription type
   */
  @param:JsonProperty(
    "premium_type",
    required = true,
  )
  @get:JsonProperty("premium_type")
  @get:NotNull
  public val premiumType: Int,
  @param:JsonProperty("premium_since")
  @get:JsonProperty("premium_since")
  public val premiumSince: String?,
  @param:JsonProperty("premium_until")
  @get:JsonProperty("premium_until")
  public val premiumUntil: String?,
  /**
   * Whether premium is set to cancel at the end of the billing period
   */
  @param:JsonProperty(
    "premium_will_cancel",
    required = true,
  )
  @get:JsonProperty("premium_will_cancel")
  @get:NotNull
  public val premiumWillCancel: Boolean,
  @param:JsonProperty("premium_billing_cycle")
  @get:JsonProperty("premium_billing_cycle")
  public val premiumBillingCycle: String?,
  @param:JsonProperty(
    "premium_lifetime_sequence",
    required = true,
  )
  @get:JsonProperty("premium_lifetime_sequence")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val premiumLifetimeSequence: Int,
  /**
   * Whether the premium badge is hidden on the profile
   */
  @param:JsonProperty(
    "premium_badge_hidden",
    required = true,
  )
  @get:JsonProperty("premium_badge_hidden")
  @get:NotNull
  public val premiumBadgeHidden: Boolean,
  /**
   * Whether the premium badge shows a masked appearance
   */
  @param:JsonProperty(
    "premium_badge_masked",
    required = true,
  )
  @get:JsonProperty("premium_badge_masked")
  @get:NotNull
  public val premiumBadgeMasked: Boolean,
  /**
   * Whether the premium start timestamp is hidden
   */
  @param:JsonProperty(
    "premium_badge_timestamp_hidden",
    required = true,
  )
  @get:JsonProperty("premium_badge_timestamp_hidden")
  @get:NotNull
  public val premiumBadgeTimestampHidden: Boolean,
  /**
   * Whether the lifetime sequence number is hidden
   */
  @param:JsonProperty(
    "premium_badge_sequence_hidden",
    required = true,
  )
  @get:JsonProperty("premium_badge_sequence_hidden")
  @get:NotNull
  public val premiumBadgeSequenceHidden: Boolean,
  /**
   * Whether premium purchases are disabled for this account
   */
  @param:JsonProperty(
    "premium_purchase_disabled",
    required = true,
  )
  @get:JsonProperty("premium_purchase_disabled")
  @get:NotNull
  public val premiumPurchaseDisabled: Boolean,
  /**
   * Whether premium features are enabled via override
   */
  @param:JsonProperty(
    "premium_enabled_override",
    required = true,
  )
  @get:JsonProperty("premium_enabled_override")
  @get:NotNull
  public val premiumEnabledOverride: Boolean,
  @param:JsonProperty("password_last_changed_at")
  @get:JsonProperty("password_last_changed_at")
  public val passwordLastChangedAt: String?,
  @param:JsonProperty("required_actions")
  @get:JsonProperty("required_actions")
  @get:Size(max = 20)
  public val requiredActions: List<String>?,
  /**
   * Whether the user is allowed to view NSFW content
   */
  @param:JsonProperty(
    "nsfw_allowed",
    required = true,
  )
  @get:JsonProperty("nsfw_allowed")
  @get:NotNull
  public val nsfwAllowed: Boolean,
  /**
   * Whether the user has dismissed the premium onboarding flow
   */
  @param:JsonProperty(
    "has_dismissed_premium_onboarding",
    required = true,
  )
  @get:JsonProperty("has_dismissed_premium_onboarding")
  @get:NotNull
  public val hasDismissedPremiumOnboarding: Boolean,
  /**
   * Whether the user has ever made a purchase
   */
  @param:JsonProperty(
    "has_ever_purchased",
    required = true,
  )
  @get:JsonProperty("has_ever_purchased")
  @get:NotNull
  public val hasEverPurchased: Boolean,
  /**
   * Whether there are unread items in the gift inventory
   */
  @param:JsonProperty(
    "has_unread_gift_inventory",
    required = true,
  )
  @get:JsonProperty("has_unread_gift_inventory")
  @get:NotNull
  public val hasUnreadGiftInventory: Boolean,
  /**
   * The number of unread gift inventory items
   */
  @param:JsonProperty(
    "unread_gift_inventory_count",
    required = true,
  )
  @get:JsonProperty("unread_gift_inventory_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val unreadGiftInventoryCount: Int,
  /**
   * Whether the user has ever used the mobile client
   */
  @param:JsonProperty(
    "used_mobile_client",
    required = true,
  )
  @get:JsonProperty("used_mobile_client")
  @get:NotNull
  public val usedMobileClient: Boolean,
  @param:JsonProperty("pending_bulk_message_deletion")
  @get:JsonProperty("pending_bulk_message_deletion")
  @get:Valid
  public val pendingBulkMessageDeletion: UserPrivateResponsePendingBulkMessageDeletion?,
)
