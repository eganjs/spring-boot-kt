package eganjs.control.extension

import eganjs.control.exception.ResourceException
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.http.HttpStatus.NOT_FOUND
import java.io.Serializable

fun <T, ID : Serializable> JpaRepository<T, ID>.safeFindById(id: ID): T {
    return id.attempt(this::getOne).orElseThrow { ResourceException(NOT_FOUND) }
}
