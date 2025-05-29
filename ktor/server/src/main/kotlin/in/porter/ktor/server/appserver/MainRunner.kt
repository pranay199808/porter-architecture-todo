package `in`.porter.ktor.server.appserver

import `in`.porter.porterbizz.data.employee.psql.di.DaggerEmployeePsqlDataComponent
import `in`.porter.ktor.server.employee.employeeRoutes
import `in`.porter.ktor.server.employee.di.DaggerEmployeeHttpComponent
import `in`.porter.ktor.server.employee.di.EmployeeHttpModule
import io.ktor.server.engine.*
import io.ktor.server.jetty.*
import io.ktor.server.routing.routing

import mu.KotlinLogging.logger
import org.apache.logging.log4j.LogManager
import org.eclipse.jetty.server.ServerConnector
import org.jetbrains.exposed.sql.Database
import java.util.concurrent.CountDownLatch

private val logger = logger("in.porter.porterbizz.ktor.server.appserver.MainRunnerKt")

fun main() {

  val database: Database  // initialize or get your Exposed Database instance

  val employeePsqlDataComponent = DaggerEmployeePsqlDataComponent.builder()
    .build()

  val employeeHttpModule = EmployeeHttpModule() // if needed, or convert to abstract module


  val employeeHttpComponent = DaggerEmployeeHttpComponent.factory().create(
    employeeHttpModule = employeeHttpModule,
    employeePsqlDataComponent = employeePsqlDataComponent
  )


  val appShutdown = CountDownLatch(1)
  val server = embeddedServer(Jetty, port = 8084) {
    routing {
      employeeRoutes(employeeHttpComponent)
    }
  }

  (server.environment.connectors.first() as? ServerConnector)?.idleTimeout = 60000L  // 60 seconds


  Runtime.getRuntime().addShutdownHook(Thread {
    appShutdown.countDown()
  })

  server.start(false)
  logger.info { "Server started" }

  appShutdown.await()

  // Note: This requires log4j2 configuration: `shutdownHook: disable`
  LogManager.shutdown()
}



