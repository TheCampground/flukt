package dev.thecampground.dev.thecampground.flukt.core.user.self

import app.fluxer.client.NetworkResult
import app.fluxer.client.UsersMeClient
import org.slf4j.LoggerFactory

class UserSelfManagerInternal(private val api: UsersMeClient) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    suspend fun getSelf() {
        when (val res = api.getCurrentUser()) {
            is NetworkResult.Success -> {
                logger.info("Got user info")
                logger.info("User: ${res.data}")
            }
            else -> {}
        }
    }
}