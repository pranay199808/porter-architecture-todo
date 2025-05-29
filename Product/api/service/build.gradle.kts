plugins {
  kotlin("jvm")
  kotlin("kapt")
}

dependencies {
  implementation(project(":Product:api:api-models"))
  implementation(project(":Product:domain"))
  implementation(project(":Product:data"))
  
  // Ktor
  implementation("io.ktor:ktor-server-core:2.3.7")
  implementation("io.ktor:ktor-server-netty:2.3.7")
  implementation("io.ktor:ktor-server-content-negotiation:2.3.7")
  implementation("io.ktor:ktor-serialization-jackson:2.3.7")
  implementation("io.ktor:ktor-server-status-pages:2.3.7")
  implementation("io.ktor:ktor-server-cors:2.3.7")
  
  // DI
  implementation("com.google.dagger:dagger:2.48")
  kapt("com.google.dagger:dagger-compiler:2.48")
  
  // Logging
  implementation("ch.qos.logback:logback-classic:1.4.11")
  implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")
  
  // Jackson
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
  implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2")

}
