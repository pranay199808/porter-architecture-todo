plugins {
    kotlin("jvm")
    kotlin("kapt")
    id("io.ktor.plugin") version "2.3.7"
    application
}

application {
    mainClass.set("com.porter.employee.server.ApplicationKt")
}

dependencies {
    // Project modules
    implementation(project(":commons"))
    implementation(project(":Product:domain"))
    implementation(project(":Product:api:service"))
    implementation(project(":Product:data"))
    implementation(project(":Product:data:psql"))
    implementation(project(":Product:api:api-models"))

    // Ktor Server Core & Plugins
    implementation("io.ktor:ktor-server-core:2.3.7")
    implementation("io.ktor:ktor-server-netty:2.3.7") // or ktor-server-jetty if you're using Jetty instead
    implementation("io.ktor:ktor-server-status-pages:2.3.7")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.7")
    implementation("io.ktor:ktor-serialization-jackson:2.3.7")
    implementation("io.ktor:ktor-server-call-logging:2.3.7")
    implementation("io.ktor:ktor-server-cors:2.3.7")
    implementation("io.ktor:ktor-server-forwarded-header:2.3.7")
    implementation("io.ktor:ktor-server-call-id:2.3.7")
    implementation("io.ktor:ktor-server-double-receive:2.3.7")

    // Jackson JSON (for serialization)
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.+")

    // Logging
    implementation("ch.qos.logback:logback-classic:1.4.11") // used by default with Ktor
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.20.0") // binds Log4j to SLF4J
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")

    // Database
    implementation("org.postgresql:postgresql:42.7.2")
    implementation("com.zaxxer:HikariCP:5.1.0")
    implementation("org.flywaydb:flyway-core:10.8.1")
    implementation("org.jetbrains.exposed:exposed-core:0.47.0")
    implementation("org.jetbrains.exposed:exposed-dao:0.47.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.47.0")
    implementation("org.jetbrains.exposed:exposed-java-time:0.47.0")
    implementation("io.ktor:ktor-server-jetty:2.3.8")


    // Dependency Injection with Dagger
    implementation("com.google.dagger:dagger:2.48")
    kapt("com.google.dagger:dagger-compiler:2.48")

    // Testing
    testImplementation("io.ktor:ktor-server-test-host:2.3.7")
    testImplementation("com.h2database:h2:2.2.224")
}
