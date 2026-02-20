package dev.thecampground.dev.thecampground.flukt.di

import app.fluxer.client.ApiConfiguration
import app.fluxer.client.AuthLoginClient
import app.fluxer.client.UsersMeClient
import app.fluxer.client.WellKnownFluxerClient
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import dev.thecampground.dev.thecampground.flukt.FluktOptions
import dev.thecampground.dev.thecampground.flukt.core.AuthManagerInternal
import dev.thecampground.dev.thecampground.flukt.core.InstanceManagerInternal
import dev.thecampground.dev.thecampground.flukt.core.user.self.UserSelfManagerInternal
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.header
import io.ktor.serialization.jackson.*
import org.koin.dsl.module
import org.slf4j.LoggerFactory

private val fluktRetryLogger = LoggerFactory.getLogger("FluktRetryLogger")

internal fun createSdkModule(options: FluktOptions) = module {
    single { options }
    single {
        HttpClient(CIO) {
            // TODO: Better logging configuration for http client
            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.HEADERS
            }
            install(ContentNegotiation) {
                jackson {
                    registerKotlinModule()
                }
            }

            install(DefaultRequest) {
                url(options.baseUrl)

                // TODO: Better way to check if authorization header should be prepended with BOT or not
                if (options.token != null) header("Authorization", "${if (options.token?.startsWith("flx_") == true) "" else "Bot"} ${options.token}")
            }

            install(HttpRequestRetry) {
                retryOnServerErrors(maxRetries = options.maxRetries)
                exponentialDelay()

                // TODO: Better retry logging, or remove
                retryOnExceptionIf { request, cause ->
                    fluktRetryLogger.warn("Request ${request.url} attempt $retryCount failed (${cause}) Retrying..")
                    true
                }
            }
        }
    }

    // Managers
    single { InstanceManagerInternal(WellKnownFluxerClient(get())) }
    single { UserSelfManagerInternal(UsersMeClient(get())) }
    single { AuthManagerInternal(AuthLoginClient(get())) }
}