package eganjs.boundary

import eganjs.control.service.EntityService
import eganjs.entity.Identifiable
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RequestMethod.POST
import java.util.*

abstract class EntityController<T : Identifiable>(
        private val entityService: EntityService<T>
) {
    @RequestMapping(method = [POST])
    @ResponseBody
    @ResponseStatus(CREATED)
    fun create(@RequestBody entity: T): T = entityService.create(entity)

    @RequestMapping(method = [GET])
    @ResponseBody
    @ResponseStatus(OK)
    fun readAll(): Collection<T> = entityService.readAll()

    @RequestMapping(method = [GET], value = ["{id}"])
    @ResponseBody
    @ResponseStatus(OK)
    fun readById(@RequestParam id: UUID): T = entityService.readById(id)
}
