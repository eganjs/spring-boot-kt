package eganjs.boundary

import eganjs.control.service.TeamService
import eganjs.entity.Team
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("team")
class TeamController @Autowired constructor(
        teamService: TeamService
) : EntityController<Team>(
        teamService
)
