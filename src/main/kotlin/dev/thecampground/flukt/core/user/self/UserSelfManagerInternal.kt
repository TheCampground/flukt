package dev.thecampground.dev.thecampground.flukt.core.user.self

import app.fluxer.client.NetworkResult
import app.fluxer.client.UsersMeClient
import app.fluxer.models.UserPrivateResponse
import dev.thecampground.dev.thecampground.flukt.FluktClient
import dev.thecampground.dev.thecampground.flukt.core.UserAvatar
import dev.thecampground.dev.thecampground.flukt.core.UserBanner
import org.slf4j.LoggerFactory

class UserSelfManagerInternal(private val api: UsersMeClient) {
    var profile: UserPrivateResponse? = null
    private val logger = LoggerFactory.getLogger(this::class.java)

    suspend fun getSelf() {
        when (val res = api.getCurrentUser()) {
            is NetworkResult.Success -> {
                logger.info("Got user info")
                logger.info("User: ${res.data}")
            }
            else -> {
                logger.error("Failed to get user info: ${res}")
            }
        }
    }
}

open class User(
    val id: String,
    val username: String,
    val discriminator: String,
    val globalName: String,
    val avatar: UserAvatar,
    val bot: Boolean,
    val system: Boolean,
    val flags: Int,
    val isStaff: Boolean,
)

class UserSelf(
    @Transient val client: FluktClient,
    private val data: UserPrivateResponse,
) : User(
    id = data.id,
    username = data.username,
    discriminator = data.discriminator,
    globalName = data.globalName ?: "",
    avatar = UserAvatar(
        url = data.avatar,
        color = data.avatarColor
    ),
    bot = data.bot == true,
    system = data.system == true,
    flags = data.flags,
    isStaff = data.isStaff
) {
    val acls: List<String> = data.acls
    val traits: List<String> = data.traits
    val email: String? = data.email
    val emailBounced: Boolean? = data.emailBounced
    val phone: String? = data.phone
    val bio: String? = data.bio
    val pronouns: String? = data.pronouns
    val accentColor: Int = data.accentColor
    val banner: UserBanner = UserBanner(
        url = data.banner,
        color = data.bannerColor,
    )
    val mfaEnabled: Boolean = data.mfaEnabled
    val authenticatorTypes: List<Int>? = data.authenticatorTypes
    val verified: Boolean = data.verified

    // User premium types
    val premiumType: Int = data.premiumType
    val premiumSince: String? = data.premiumSince
    val premiumUntil: String? = data.premiumUntil
    val premiumWillCancel: Boolean = data.premiumWillCancel
    val premiumBillingCycle: String? = data.premiumBillingCycle
    val premiumLifetimeSequence: Int = data.premiumLifetimeSequence

    // TODO: Finish user impl

}