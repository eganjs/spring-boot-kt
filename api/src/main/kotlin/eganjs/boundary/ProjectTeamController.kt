package eganjs.boundary

import eganjs.entity.Project
import eganjs.entity.Team
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("project/team")
class ProjectTeamController : ParentChildEntityController<Project, Team>()
