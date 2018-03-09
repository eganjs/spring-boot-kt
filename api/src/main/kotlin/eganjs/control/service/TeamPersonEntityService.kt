package eganjs.control.service

import eganjs.entity.Person
import eganjs.entity.Team
import org.springframework.stereotype.Service

@Service
class TeamPersonEntityService : ParentChildEntityService<Team, Person>()
