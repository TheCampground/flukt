package dev.thecampground.dev.thecampground.flukt.di

import app.fluxer.client.AuthLoginClient
import app.fluxer.client.WellKnownFluxerClient
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import dev.thecampground.dev.thecampground.flukt.FluktOptions
import dev.thecampground.dev.thecampground.flukt.core.AuthManagerInternal
import dev.thecampground.dev.thecampground.flukt.core.InstanceManagerInternal
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.header
import io.ktor.serialization.jackson.*
import org.koin.dsl.module
import org.slf4j.LoggerFactory

private val fluktRetryLogger = LoggerFactory.getLogger("FluktRetryLogger")

internal fun createSdkModule(options: FluktOptions) = module {
    single { options }

    single {
        HttpClient(CIO) {
            install(ContentNegotiation) {
                jackson {
                    registerKotlinModule()
                }
            }

            install(DefaultRequest) {
                url(options.baseUrl)

                if (options.token != null) header("Authorization", "Bearer ${options.token}")
            }

            install(HttpRequestRetry) {
                retryOnServerErrors(maxRetries = options.maxRetries)
                exponentialDelay()

                retryOnExceptionIf { request, cause ->
                    fluktRetryLogger.warn("Request ${request.url} attempt $retryCount failed (${cause}) Retrying..")
                    true
                }
            }
        }
    }

    // Managers
    single { InstanceManagerInternal(WellKnownFluxerClient(get())) }
    single { AuthManagerInternal(AuthLoginClient(get())) }
}