object Plugins {
  private const val kotlinPrefix = "org.jetbrains.kotlin"
  const val kotlinJvm = "$kotlinPrefix.jvm"
  const val kotlinKapt = "kotlin-kapt"

  const val kotlinxSerialization = "plugin.serialization"

  const val flywayPlugin = "org.flywaydb.flyway"
  const val flywayVersion = "6.2.0"

  const val mavenPublish = "org.gradle.maven-publish"
  const val mavenS3 = "com.github.brodziakm.maven-s3"
  const val mavenS3Version = "1.4.0"

  const val sonaTypePlugin = "org.sonatype.gradle.plugins.scan"
  const val sonaTypePluginVersion = "2.6.0"

  const val fatJarPlugin = "com.github.johnrengelman.shadow"
  const val fatJarPluginVersion = "8.1.1"

  object Jacoco {
    const val version = "0.8.7"
    const val jacocoPlugin = "jacoco"
  }

  object SonarQube {
    const val version = "4.4.1.3373"
    const val sonarPlugin = "org.sonarqube"
  }
  object Detekt {
    const val version = "1.23.5"
    const val detektLib = "io.gitlab.arturbosch.detekt"
    const val formatting = "io.gitlab.arturbosch.detekt:detekt-formatting:$version"
  }
}
