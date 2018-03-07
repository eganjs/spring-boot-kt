package eganjs.entity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.FetchType.EAGER
import javax.persistence.OneToMany
import javax.persistence.OneToOne

@Entity
data class Team @JsonCreator constructor(
        @JsonProperty("id")
        val name: String,
        @JsonProperty("lead")
        @OneToOne(targetEntity = Person::class, fetch = EAGER)
        val lead: Person,
        @JsonProperty("members")
        @OneToMany(targetEntity = Person::class, fetch = EAGER)
        val members: Set<Person>
) : Identifiable()
