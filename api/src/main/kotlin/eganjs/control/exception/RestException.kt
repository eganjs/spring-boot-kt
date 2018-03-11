package eganjs.control.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class RestException(
        val status: HttpStatus
) : Exception(
        status.reasonPhrase
) {

    fun toResponseEntity(): ResponseEntity<String> = ResponseEntity.status(status).body(message)
}
