package eganjs.control.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(ResourceException::class)
    fun handle(e: ResourceException): ResponseEntity<String> = e.toResponseEntity()
}
