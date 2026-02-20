package dev.thecampground.dev.thecampground.flukt.core

import app.fluxer.client.AuthLoginClient
import app.fluxer.client.NetworkResult
import app.fluxer.models.AuthLoginResponse
import app.fluxer.models.AuthMfaRequiredResponse
import app.fluxer.models.LoginRequest
import arrow.core.Either
import arrow.core.raise.either
import dev.thecampground.dev.thecampground.flukt.common.ErrorResponse
import org.koin.java.KoinJavaComponent.get
import org.koin.java.KoinJavaComponent.inject

class AuthManagerInternal(
    private val loginClient: AuthLoginClient,
) {
    suspend fun loginAsUser(email: String, password: String, inviteCode: String? = null): Either<ErrorResponse, Unit> = either {
        val res = loginClient.loginUser(LoginRequest(email, password, inviteCode))

        when (res) {
            is NetworkResult.Success -> {
                val isMFARes = res.data is AuthMfaRequiredResponse
            }
            else -> {
                // TODO: Handle Captcha Req? Look into how to support captcha.
                throw IllegalStateException("Failed to login ${res}")
            }
        }
    }
}