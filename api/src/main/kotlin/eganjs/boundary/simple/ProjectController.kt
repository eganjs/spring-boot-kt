package eganjs.boundary.simple

import eganjs.entity.Project
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("project")
class ProjectController : EntityController<Project>() {
    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody entity: Project): Project = entityService.create(entity)
}
