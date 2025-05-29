package `in`.porter.ktor.server.employee.usecases

import com.fasterxml.jackson.databind.JsonMappingException
import `in`.porter.employee.apimodels.employee.usecases.entities.Employee
import `in`.porter.employee.apimodels.employee.usecases.entities.PaginationRequest
import `in`.porter.porterbizz.service.employee.usecases.EmployeeService
import `in`.porter.porterbizz.service.employee.exceptions.EmployeeApiException
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule


import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import javax.inject.Inject

class EmployeeHttpService
@Inject
constructor(
    private val service: EmployeeService
) {
    suspend fun getEmployee(call: ApplicationCall) {
        try {
            val id = call.parameters["id"]?.toIntOrNull()
                ?: return call.respond(HttpStatusCode.BadRequest, "Invalid employee ID")
            
            val response = service.getEmployee(id)
            val mapper = jacksonObjectMapper().registerKotlinModule()

            call.respondText(
                text = mapper.writeValueAsString(response),
                contentType = ContentType.Application.Json,
                status = HttpStatusCode.OK
            )
        } catch (e: EmployeeApiException.NotFound) {
            call.respond(HttpStatusCode.NotFound, e.message.toString())
        } catch (e: Exception) {
            call.respond(HttpStatusCode.InternalServerError, e.message.toString())
        }
    }

    suspend fun getAllEmployees(call: ApplicationCall) {
        try {
            val page = call.parameters["page"]?.toIntOrNull() ?: 1
            val pageSize = call.parameters["pageSize"]?.toIntOrNull() ?: 10

            val mapper = jacksonObjectMapper().registerKotlinModule()


            val paginationRequest = PaginationRequest(page = page, pageSize = pageSize)
            val response = service.getAllEmployees(paginationRequest)
            call.respondText(
                text = mapper.writeValueAsString(response),
                contentType = ContentType.Application.Json,
                status = HttpStatusCode.OK
            )
        } catch (e: Exception) {
            call.respond(HttpStatusCode.InternalServerError, e.message.toString())
        }
    }

    suspend fun createEmployee(call: ApplicationCall) {
        try {

            val body = call.receiveText()
            println("Raw request body: $body")

            val mapper = jacksonObjectMapper().registerKotlinModule()
            val employee: Employee = mapper.readValue(body)

            println("Deserialized Employee: $employee")

            val response = service.createEmployee(employee)

            call.respondText(
                text = mapper.writeValueAsString(response),
                contentType = ContentType.Application.Json,
                status = HttpStatusCode.Created
            )
        } catch (e: JsonMappingException) {
            call.respond(HttpStatusCode.BadRequest, "Invalid request format")
        } catch (e: EmployeeApiException.ValidationError) {
            call.respond(HttpStatusCode.UnprocessableEntity, e.message.toString())
        } catch (e: EmployeeApiException.AlreadyExists) {
            call.respond(HttpStatusCode.Conflict, e.message.toString())
        } catch (e: Exception) {
            call.respond(HttpStatusCode.InternalServerError, e.message.toString())
        }
    }

    suspend fun updateEmployee(call: ApplicationCall) {
        try {
            val id = call.parameters["id"]?.toIntOrNull()
                ?: return call.respond(HttpStatusCode.BadRequest, "Invalid employee ID")
            
            val body = call.receiveText()
            println("Raw request body: $body")

            val mapper = jacksonObjectMapper().registerKotlinModule()
            val employee: Employee = mapper.readValue(body)
            val response = service.updateEmployee(id, employee)

            call.respondText(
                text = mapper.writeValueAsString(response),
                contentType = ContentType.Application.Json,
                status = HttpStatusCode.OK
            )
        } catch (e: JsonMappingException) {
            call.respond(HttpStatusCode.BadRequest, "Invalid request format")
        } catch (e: EmployeeApiException.NotFound) {
            call.respond(HttpStatusCode.NotFound, e.message.toString())
        } catch (e: EmployeeApiException.ValidationError) {
            call.respond(HttpStatusCode.UnprocessableEntity, e.message.toString())
        } catch (e: Exception) {
            call.respond(HttpStatusCode.InternalServerError, e.message.toString())
        }
    }

    suspend fun deleteEmployee(call: ApplicationCall) {
        try {
            val id = call.parameters["id"]?.toIntOrNull()
                ?: return call.respond(HttpStatusCode.BadRequest, "Invalid employee ID")
            
            service.deleteEmployee(id)

            val mapper = jacksonObjectMapper().registerKotlinModule()

            val response = mapOf("message" to "employee deleted successfully")

            call.respondText(
                text = mapper.writeValueAsString(response),
                contentType = ContentType.Application.Json,
                status = HttpStatusCode.OK
            )
        } catch (e: EmployeeApiException.NotFound) {
            call.respond(HttpStatusCode.NotFound, e.message.toString())
        } catch (e: Exception) {
            call.respond(HttpStatusCode.InternalServerError, e.message.toString())
        }
    }
}
