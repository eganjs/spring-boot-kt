package eganjs.control.service

import eganjs.control.repository.ProjectRepository
import eganjs.entity.Project
import org.springframework.beans.factory.annotation.Autowired

class ProjectService @Autowired constructor(
        projectRepository: ProjectRepository
) : EntityService<Project>(
        projectRepository
)
