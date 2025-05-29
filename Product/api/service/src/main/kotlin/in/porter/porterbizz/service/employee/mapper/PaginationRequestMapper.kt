package `in`.porter.porterbizz.service.employee.mapper


import `in`.porter.employee.apimodels.employee.usecases.entities.PaginationRequest
import javax.inject.Inject


class PaginationRequestMapper
@Inject
constructor() {

  fun toDomain(request: PaginationRequest): `in`.porter.porterbizz.domain.employee.entities.PaginationRequest {
    return `in`.porter.porterbizz.domain.employee.entities.PaginationRequest(
      page = request.page,
      pageSize = request.pageSize
    )
  }

  fun fromDomain(domain: `in`.porter.porterbizz.domain.employee.entities.PaginationRequest): PaginationRequest {
    return PaginationRequest(
      page = domain.page,
      pageSize = domain.pageSize
    )
  }

}
