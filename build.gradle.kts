plugins {
    kotlin("jvm") version "1.9.20" apply false
    kotlin("kapt") version "1.9.20" apply false
    id("io.ktor.plugin") version "2.3.7" apply false
}

allprojects {
    group = "com.porter.employee"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.kapt")

    dependencies {
        val daggerVersion = "2.48"
        val ktorVersion = "2.3.7"
        val jacksonVersion = "2.15.3"

        // Kotlin
        "implementation"("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        "implementation"("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

        // Dagger
        "implementation"("com.google.dagger:dagger:$daggerVersion")
        "kapt"("com.google.dagger:dagger-compiler:$daggerVersion")

        // Ktor
        "implementation"("io.ktor:ktor-client-core:$ktorVersion")
        "implementation"("io.ktor:ktor-client-cio:$ktorVersion")
        "implementation"("io.ktor:ktor-client-content-negotiation:$ktorVersion")

        // Jackson
        "implementation"("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
        "implementation"("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")

    }
} 