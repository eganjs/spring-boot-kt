package eganjs.control.service.composite

import eganjs.entity.Project
import eganjs.entity.Team
import org.springframework.stereotype.Service

@Service
class ProjectTeamEntityService : ParentChildEntityService<Project, Team>()
