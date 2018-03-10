package eganjs.boundary.composite

import eganjs.control.service.composite.ParentChildEntityService
import eganjs.entity.Identifiable
import eganjs.entity.ParentIdentifiable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.*
import java.util.*

abstract class ParentChildEntityController<P : ParentIdentifiable<C>, C : Identifiable> {
    @Autowired
    protected lateinit var parentChildEntityService: ParentChildEntityService<P, C>

    @PostMapping
    @ResponseBody
    @ResponseStatus(CREATED)
    fun createChild(@PathVariable id: UUID, @RequestBody entity: C): C =
            parentChildEntityService.createChildOnParent(id, entity)

    @GetMapping
    @ResponseBody
    @ResponseStatus(OK)
    fun readChildrenByParentId(@PathVariable id: UUID): Collection<C> =
            parentChildEntityService.readChildrenOnParent(id)
}
