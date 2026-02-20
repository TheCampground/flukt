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
import dev.thecampground.dev.thecampground.flukt.core.AuthManagerInternal
import dev.thecampground.dev.thecampground.flukt.core.InstanceManagerInternal
import dev.thecampground.dev.thecampground.flukt.di.createSdkModule
import io.ktor.client.request.get
import io.ktor.serialization.jackson.jackson
import kotlinx.coroutines.runBlocking
import org.koin.dsl.koinApplication
import org.slf4j.LoggerFactory
import kotlin.time.measureTime

class FluktClient private constructor(private val koin: Koin) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    // Expose your managers to the user
    val instance: InstanceManagerInternal by koin.inject()

    val auth: AuthManagerInternal by koin.inject()

    companion object {
        /**
         * Create's a Flukt Client.
         */
        suspend fun create(builder: FluktOptions.() -> Unit = {}): FluktClient {
            val fluktCreationTimeStart = System.currentTimeMillis()
            val options = FluktOptions().apply(builder)

            // Create an isolated Koin context
            val koinApp = koinApplication {
                modules(createSdkModule(options))
            }

            val client = FluktClient(koinApp.koin)

            client.logger.info("Flukt started in {}", "${System.currentTimeMillis()-fluktCreationTimeStart}ms!")
            client.instance.refresh()

            return client
        }
    }
}
