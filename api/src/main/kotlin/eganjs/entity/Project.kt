package eganjs.entity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.FetchType.EAGER
import javax.persistence.OneToMany

@Entity
data class Project @JsonCreator constructor(
        @JsonProperty("name")
        val name: String,
        @JsonProperty("lead")
        val lead: Person,
        @JsonProperty("")
        @OneToMany(targetEntity = Team::class, fetch = EAGER)
        val teams: Set<Team>
) : Identifiable()
