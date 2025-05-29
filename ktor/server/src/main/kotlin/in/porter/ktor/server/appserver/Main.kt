package `in`.porter.ktor.server.appserver

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.module.kotlin.KotlinModule
import `in`.porter.ktor.server.employee.employeeRoutes
import `in`.porter.ktor.server.employee.di.EmployeeHttpComponent
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.serialization.jackson.jackson
import io.ktor.server.plugins.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.doublereceive.*
import io.ktor.server.plugins.forwardedheaders.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

import io.ktor.server.plugins.callid.CallId
import io.ktor.server.plugins.callid.callIdMdc
import io.ktor.server.plugins.callloging.CallLogging
import org.slf4j.LoggerFactory
import io.ktor.server.request.*

import org.slf4j.event.Level

private val logger = LoggerFactory.getLogger("ApplicationMain")

fun Application.mainApp(
    employeeHttpComponent: EmployeeHttpComponent
) {


    install(ContentNegotiation) {
        jackson {
            registerModule(KotlinModule.Builder().build()) // important for Kotlin support
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }


    // XForwardedHeaders with default configuration
    install(XForwardedHeaders)

    // DoubleReceive with default configuration
    install(DoubleReceive) {
        cacheRawRequest = true
    }

    // Call ID for request tracking
    install(CallId) {
        header(HttpHeaders.XRequestId)
        verify { callId: String ->
            callId.isNotEmpty()
        }
    }

    // Call Logging
    install(CallLogging) {
        level = Level.INFO
        filter { call -> call.request.path().startsWith("/") }
        callIdMdc("call-id")
    }


    // Status Pages for error handling
    install(StatusPages) {
        exception<MissingRequestParameterException> { call, exception ->
            call.respond(
                HttpStatusCode.BadRequest,
                mapOf("message" to "Request parameter ${exception.parameterName} is missing")
            )
        }
        exception<JsonProcessingException> { call, exception ->
            call.respond(
                HttpStatusCode.BadRequest,
                mapOf("message" to exception.originalMessage)
            )
        }

        exception<Throwable> { call, cause ->
            logger.error("Unhandled error", cause)
            call.respond(
                HttpStatusCode.InternalServerError,
                mapOf("message" to (cause.message ?: "Internal Server Error"))
            )
        }
    }

    // Routing configuration
    routing {
        get("/") { call.respond(HttpStatusCode.OK, Unit) }
        route("emp") { employeeRoutes(employeeHttpComponent) }
    }
} 