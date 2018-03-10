package eganjs.boundary.simple

import eganjs.entity.Person
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("person")
class PersonController : EntityController<Person>()
