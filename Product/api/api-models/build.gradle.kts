plugins {
  kotlin("jvm")
  kotlin("kapt")
  kotlin("plugin.serialization") version "1.9.0"
  `maven-publish`
}

dependencies {
  // Kotlin Serialization
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.5.1")
  
  // Ktor
  implementation("io.ktor:ktor-client-core:2.3.7")
  implementation("io.ktor:ktor-client-jackson:2.3.7")
  implementation("io.ktor:ktor-client-content-negotiation:2.3.7")
  implementation("io.ktor:ktor-serialization-jackson:2.3.7")
  
  // Jackson
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
  implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2")
  
  // Dagger
  implementation("com.google.dagger:dagger:2.48")
  kapt("com.google.dagger:dagger-compiler:2.48")
  

}


