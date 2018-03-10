package eganjs.control.service.composite

import eganjs.control.service.simple.EntityService
import eganjs.entity.Identifiable
import eganjs.entity.ParentIdentifiable
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

abstract class ParentChildEntityService<P : ParentIdentifiable<C>, C : Identifiable>() {
    @Autowired
    protected lateinit var parentEntityService: EntityService<P>
    @Autowired
    protected lateinit var childEntityService: EntityService<C>

    fun createChildOnParent(parentId: UUID, child: C): C {
        val parent: P = parentEntityService.readById(parentId)
        parent.getChildren().add(child)
        val createdChild: C = childEntityService.create(child)
        parentEntityService.update(parent)
        return createdChild
    }

    fun readChildrenOnParent(parentId: UUID): Collection<C> {
        val parent: P = parentEntityService.readById(parentId)
        return parent.hydrateAndGetChildren()
    }
}
