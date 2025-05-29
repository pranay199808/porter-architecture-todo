package `in`.porter.porterbizz.service.employee.mapper

import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.employee.apimodels.employee.usecases.entities.Employee as ApiEmployee
import javax.inject.Inject

class EmployeeMapper
@Inject
constructor() {
    fun fromDomainModel(domain: Employee): ApiEmployee {
        return ApiEmployee(
            id = domain.id,
            firstName = domain.firstName,
            lastName = domain.lastName,
            email = domain.email,
            department = domain.department,
            position = domain.position,
            salary = domain.salary,
            phoneNumber = domain.phoneNumber,
            dateOfBirth = domain.dateOfBirth,
            startDate = domain.startDate
        )
    }

    fun toDomainModel(api: ApiEmployee): Employee {
        return Employee(
            id = api.id,
            firstName = api.firstName,
            lastName = api.lastName,
            email = api.email,
            department = api.department,
            position = api.position,
            salary = api.salary,
            phoneNumber = api.phoneNumber,
            dateOfBirth = api.dateOfBirth,
            startDate = api.startDate
        )
    }
} 