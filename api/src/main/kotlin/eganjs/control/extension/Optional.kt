package eganjs.control.extension

import eganjs.control.exception.RestException
import eganjs.entity.Identifiable
import org.springframework.http.HttpStatus
import java.util.*

fun <T : Identifiable> Optional<T>.orElseThrowNotFound(): T = orElseThrow { RestException(HttpStatus.NOT_FOUND) }
