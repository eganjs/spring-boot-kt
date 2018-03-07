package eganjs.control.service

import eganjs.control.repository.PersonRepository
import eganjs.entity.Person
import org.springframework.beans.factory.annotation.Autowired

class PersonService @Autowired constructor(
        personRepository: PersonRepository
) : EntityService<Person>(
        personRepository
)
