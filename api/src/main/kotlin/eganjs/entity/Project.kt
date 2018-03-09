package eganjs.entity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.OneToMany

@Entity
data class Project @JsonCreator constructor(
        @JsonProperty("name")
        val name: String,
        @JsonIgnore
        @OneToMany(targetEntity = Team::class, fetch = LAZY)
        val teams: MutableSet<Team> = mutableSetOf()
) : ParentIdentifiable<Team>() {
    override fun getChildren() = ::teams.get()
}
