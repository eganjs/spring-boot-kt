package eganjs.boundary

import eganjs.control.service.PersonService
import eganjs.entity.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("person")
class PersonController @Autowired constructor(
        personService: PersonService
) : EntityController<Person>(
        personService
)
