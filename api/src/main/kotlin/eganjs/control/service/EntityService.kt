package eganjs.control.service

import eganjs.control.extension.safeFindById
import eganjs.entity.Identifiable
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

abstract class EntityService<T : Identifiable> {
    @Autowired
    protected lateinit var repository: JpaRepository<T, UUID>

    fun create(entity: T): T = repository.saveAndFlush(entity)

    fun readAll(): Collection<T> = repository.findAll()

    fun readById(id: UUID): T = repository.safeFindById(id)

    fun update(entity: T): T = repository.saveAndFlush(entity)
}
