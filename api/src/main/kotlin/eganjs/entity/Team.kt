package eganjs.entity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.OneToMany

@Entity
data class Team @JsonCreator constructor(
        @JsonProperty("name")
        val name: String,
        @JsonIgnore
        @OneToMany(targetEntity = Person::class, fetch = LAZY)
        val members: MutableSet<Person> = mutableSetOf()
) : ParentIdentifiable<Person>() {
    override fun getChildren() = ::members.get()
}
