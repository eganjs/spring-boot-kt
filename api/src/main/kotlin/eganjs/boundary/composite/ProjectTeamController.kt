package eganjs.boundary.composite

import eganjs.entity.Project
import eganjs.entity.Team
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("project/{id}/team")
class ProjectTeamController : ParentChildEntityController<Project, Team>()
