plugins {
    kotlin("jvm") version "2.2.21"
    id("ch.acanda.gradle.fabrikt") version "1.29.2"
}

val ktorVersion = "3.4.0"

fabrikt {
    generate("fluxer") {
        apiFile = file("ext/openapi.json")
        outputDirectory= file("src/main/kotlin/dev/thecampground/flukt/generated")
        basePackage = "app.fluxer"
        client {
            generate = false
            target = Ktor
            suspendModifier = true
        }

        model {
            generate = false
            serializationLibrary = Jackson // forced to use jackson for now because all webauthn endpoints use untyped responses!
        }
    }
}

group = "dev.thecampground"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

sourceSets {
    main {
        java {
            srcDir("${buildDir}/generate-resources/main/src")
        }
    }
}

java {
    toolchain {
        // Use the same Java version variable defined earlier
        languageVersion.set(JavaLanguageVersion.of(JavaVersion.VERSION_24.ordinal))
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}
dependencies {
    testImplementation(kotlin("test"))

    // Ktor Client
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-cio:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-jackson:${ktorVersion}")
//    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")

    // Arrow
    implementation("io.arrow-kt:arrow-core:2.2.1.1")
    implementation("io.arrow-kt:arrow-fx-coroutines:2.2.1.1")

    // Koin
    implementation(platform("io.insert-koin:koin-bom:4.1.1"))
    implementation("io.insert-koin:koin-core")

    // Source: https://mvnrepository.com/artifact/jakarta.annotation/jakarta.annotation-api
    implementation("jakarta.annotation:jakarta.annotation-api:3.0.0")
    // Source: https://mvnrepository.com/artifact/jakarta.validation/jakarta.validation-api
    implementation("jakarta.validation:jakarta.validation-api:3.1.1")
}

tasks.test {
    useJUnitPlatform()
}