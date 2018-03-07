package eganjs.control.repository

import eganjs.entity.Identifiable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import java.util.*

@NoRepositoryBean
interface EntityRepository<T : Identifiable> : JpaRepository<T, UUID>
