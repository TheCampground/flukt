package dev.thecampground.dev.thecampground.flukt

import dev.thecampground.dev.thecampground.flukt.api.createApiModule
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import org.koin.core.Koin
import org.koin.core.context.startKoin
import org.koin.dsl.module
import app.fluxer.client.AuthLoginClient
import app.fluxer.client.NetworkResult
import app.fluxer.client.WellKnownFluxerClient
import app.fluxer.models.WellKnownFluxerResponse
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.serialization.jackson.jackson
import kotlinx.coroutines.runBlocking

class FluktClient(
    private val baseUrl: String = "https://api.fluxer.app",
    private val httpClient: HttpClient = HttpClient(CIO) {
        install(DefaultRequest) {
            url(baseUrl)
        }
        install(ContentNegotiation) {
            jackson {
                registerKotlinModule()
            }
        }
    }
) {
    var instance: WellKnownFluxerResponse
        private set

    private val koin: Koin

    val auth: AuthLoginClient

    init {
        val koinApp = startKoin {
            modules(
                module {
                    single { httpClient }
                },
                createApiModule()
            )
        }

        koin = koinApp.koin

        auth = koin.get()

        runBlocking {
            when (val wellKnownFluxerClient = koin.get<WellKnownFluxerClient>().getWellKnownFluxer()) {
                is NetworkResult.Success -> {
                    instance = wellKnownFluxerClient.data
                }
                else -> {
                    error("Couldn't establish a network client")
                }
            }
        }

    }
}