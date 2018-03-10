package eganjs.boundary.simple

import eganjs.entity.Team
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("team")
class TeamController : EntityController<Team>()
