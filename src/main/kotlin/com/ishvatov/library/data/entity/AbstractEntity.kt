package com.ishvatov.library.data.entity

import javax.persistence.*

@MappedSuperclass
open class AbstractEntity(
        @Id
        @Basic
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        } else if (other is AbstractEntity) {
            return id != null && id == other.id
        }
        return false
    }

    override fun hashCode(): Int = 31 * id!!
}