package eganjs.boundary

import eganjs.control.service.ProjectService
import eganjs.entity.Project
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("project")
class ProjectController @Autowired constructor(
        projectService: ProjectService
) : EntityController<Project>(
        projectService
)
