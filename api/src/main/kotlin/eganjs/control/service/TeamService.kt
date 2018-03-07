package eganjs.control.service

import eganjs.control.repository.TeamRepository
import eganjs.entity.Team
import org.springframework.beans.factory.annotation.Autowired

class TeamService @Autowired constructor(
        teamRepository: TeamRepository
) : EntityService<Team>(
        teamRepository
)
