package eganjs.entity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity

@Entity
data class Person @JsonCreator constructor(
        @JsonProperty("name")
        val name: String
) : Identifiable()
