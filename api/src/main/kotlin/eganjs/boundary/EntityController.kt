package eganjs.boundary

import eganjs.control.service.EntityService
import eganjs.entity.Identifiable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import java.util.*

abstract class EntityController<T : Identifiable> {
    @Autowired
    protected lateinit var entityService: EntityService<T>

    @GetMapping
    @ResponseBody
    @ResponseStatus(OK)
    fun readAll(): Collection<T> = entityService.readAll()

    @GetMapping("{id}")
    @ResponseBody
    @ResponseStatus(OK)
    fun readById(@RequestParam id: UUID): T = entityService.readById(id)
}
