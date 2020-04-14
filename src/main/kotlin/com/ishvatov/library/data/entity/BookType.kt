package com.ishvatov.library.data.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.UniqueConstraint

@Entity
@Table(
        name = BookType.TABLE_NAME,
        uniqueConstraints = [
            UniqueConstraint(name = "u_book_type_name", columnNames = ["name"])
        ]
)
class BookType(
        id: Int?,
        @Column
        var name: String?,
        @Column
        var cnt: Int?,
        @Column
        var dayCount: Int?,
        @Column
        var fine: Double?
) : AbstractEntity(id) {
    companion object {
        const val TABLE_NAME = "book_types"
    }
}