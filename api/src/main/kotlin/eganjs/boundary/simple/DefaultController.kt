package eganjs.boundary.simple

import eganjs.control.exception.RestException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DefaultController {

    @RequestMapping("**")
    fun defaultEndpoint() {
        throw RestException(HttpStatus.NOT_FOUND)
    }
}
