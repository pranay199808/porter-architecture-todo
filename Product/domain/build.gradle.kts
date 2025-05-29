plugins {
  `java-test-fixtures`

  id(Plugins.kotlinKapt)
  kotlin("jvm")
  kotlin("kapt")
}

dependencies {



  testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")

// MockK (for mocking suspend functions and coroutines)
  testImplementation("io.mockk:mockk:1.13.8")

// Kluent (for assertion DSL like `shouldBeEqualTo`)
  testImplementation("org.amshove.kluent:kluent:1.72")

  implementation(Libs.Ktor.clientCore)
  implementation(Libs.Ktor.clientCio)
  implementation(Libs.Auth0.javaJwt)

  testImplementation(Libs.hikariCP)



  kaptTest(Libs.Dagger.compiler)
//  testImplementation(project(Modules.dataPsql))



  api(Libs.Ktor.clientCore)

  implementation("io.ktor:ktor-server-jetty:2.3.8") // or your preferred Ktor version


  implementation(Libs.Apache.poi)
  implementation(Libs.Apache.ooxml)

  implementation(Libs.sentry)

  implementation("org.json:json:20231013")



  implementation(project(":Product:api:api-models"))
  implementation("io.ktor:ktor-server-core:2.3.7")
  implementation("ch.qos.logback:logback-classic:1.4.11")
  implementation("com.google.dagger:dagger:2.48")
  kapt("com.google.dagger:dagger-compiler:2.48")
  

}
tasks.test {
  useJUnitPlatform()
}

