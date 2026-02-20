package dev.thecampground.dev.thecampground.flukt

import org.koin.core.Koin
import dev.thecampground.dev.thecampground.flukt.core.AuthManagerInternal
import dev.thecampground.dev.thecampground.flukt.core.InstanceManagerInternal
import dev.thecampground.dev.thecampground.flukt.core.user.self.UserSelfManagerInternal
import dev.thecampground.dev.thecampground.flukt.di.createSdkModule
import org.koin.dsl.koinApplication
import org.slf4j.LoggerFactory

class FluktClient private constructor(koin: Koin) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    val instance: InstanceManagerInternal by koin.inject()
    val auth: AuthManagerInternal by koin.inject()

    val self: UserSelfManagerInternal by koin.inject()


    companion object {
        /**
         * Creates a Flukt Client.
         * @return FluktClient
         */
        suspend fun create(builder: FluktOptions.() -> Unit = {}): FluktClient {
            val fluktCreationTimeStart = System.currentTimeMillis()
            val options = FluktOptions().apply(builder)

            // Create an isolated Koin context
            val koinApp = koinApplication {
                modules(createSdkModule(options))
            }

            val client = FluktClient(koinApp.koin)

            client.logger.info("Flukt started in {} {}", "${System.currentTimeMillis()-fluktCreationTimeStart}ms!", options.token)
            client.instance.refresh()

            return client
        }
    }
}
