package eganjs.boundary

import eganjs.entity.Person
import eganjs.entity.Team
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("team/person")
class TeamPersonController : ParentChildEntityController<Team, Person>()
