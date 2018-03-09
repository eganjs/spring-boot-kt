package eganjs.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class ParentIdentifiable<C : Identifiable>(
        id: UUID = UUID.randomUUID()
) : Identifiable(id) {
    @JsonIgnore
    abstract fun getChildren(): MutableCollection<C>

    fun hydrateAndGetChildren(): MutableCollection<C> {
        getChildren().size
        return getChildren()
    }
}
