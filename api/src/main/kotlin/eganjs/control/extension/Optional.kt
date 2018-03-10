package eganjs.control.extension

import eganjs.control.exception.ResourceException
import eganjs.entity.Identifiable
import org.springframework.http.HttpStatus
import java.util.*

fun <T : Identifiable> Optional<T>.orElseThrowNotFound(): T = orElseThrow { ResourceException(HttpStatus.NOT_FOUND) }
