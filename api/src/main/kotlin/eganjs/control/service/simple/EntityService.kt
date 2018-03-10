package eganjs.control.service.simple

import eganjs.control.extension.orElseThrowNotFound
import eganjs.entity.Identifiable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

abstract class EntityService<T : Identifiable> {
    @Autowired
    protected lateinit var repository: JpaRepository<T, UUID>

    fun create(entity: T): T = repository.saveAndFlush(entity)

    fun readAll(): Collection<T> = repository.findAll()

    fun readById(id: UUID): T = repository.findById(id).orElseThrowNotFound()

    fun update(entity: T): T = repository.saveAndFlush(entity)
}
