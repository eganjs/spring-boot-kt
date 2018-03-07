package eganjs.entity

import java.util.*
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class Identifiable(
        @Id
        val id: UUID = UUID.randomUUID()
)