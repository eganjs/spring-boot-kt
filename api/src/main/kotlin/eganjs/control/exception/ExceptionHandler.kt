package eganjs.control.exception

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus.*
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.HttpRequestMethodNotSupportedException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(RestException::class)
    fun handle(e: RestException): ResponseEntity<String> {
        log.error("RestException handler:", e)
        return e.toResponseEntity()
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handle(e: HttpMessageNotReadableException): ResponseEntity<String> {
        log.error("Bad Request handler:", e)
        return RestException(BAD_REQUEST).toResponseEntity()
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException::class)
    fun handle(e: HttpRequestMethodNotSupportedException): ResponseEntity<String> {
        log.error("Method Not Allowed handler:", e)
        return RestException(METHOD_NOT_ALLOWED).toResponseEntity()
    }

    @ExceptionHandler(Throwable::class)
    fun handle(e: Throwable): ResponseEntity<String> {
        log.error("Internal Server Error handler:", e)
        return RestException(INTERNAL_SERVER_ERROR).toResponseEntity()
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(ExceptionHandler::class.java)
    }
}
