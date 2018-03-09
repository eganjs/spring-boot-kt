package eganjs.boundary

import eganjs.control.service.ParentChildEntityService
import eganjs.entity.Identifiable
import eganjs.entity.ParentIdentifiable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.*
import java.util.*

abstract class ParentChildEntityController<P : ParentIdentifiable<C>, C : Identifiable> {
    @Autowired
    protected lateinit var parentChildChildEntityService: ParentChildEntityService<P, C>

    @PostMapping("{id}")
    @ResponseBody
    @ResponseStatus(CREATED)
    fun createChild(@PathVariable id: UUID, @RequestBody entity: C): C =
            parentChildChildEntityService.createChildOnParent(id, entity)

    @GetMapping("{id}")
    @ResponseBody
    @ResponseStatus(OK)
    fun readChildrenByParentId(@PathVariable id: UUID): Collection<C> =
            parentChildChildEntityService.readChildrenOnParent(id)
}
