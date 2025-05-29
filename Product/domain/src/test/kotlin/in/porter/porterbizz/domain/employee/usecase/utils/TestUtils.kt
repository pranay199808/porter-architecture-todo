package `in`.porter.porterbizz.domain.employee.usecase.utils

import kotlinx.coroutines.CancellationException

suspend inline fun <reified T : Throwable> shouldThrowSuspend(
    crossinline block: suspend () -> Unit
): T {
    try {
        block()
    } catch (e: Throwable) {
        if (e is CancellationException) throw e
        if (e is T) return e
        throw AssertionError("Expected exception ${T::class}, but was ${e::class}", e)
    }
    throw AssertionError("Expected exception ${T::class} but no exception was thrown")
}