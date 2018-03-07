package eganjs.control.service

import eganjs.control.extension.safeFindById
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

abstract class EntityService<T>(
        private val repository: JpaRepository<T, UUID>
) {
    fun create(entity: T): T = repository.saveAndFlush(entity)

    fun readAll(): Collection<T> = repository.findAll()

    fun readById(id: UUID): T = repository.safeFindById(id)
}
