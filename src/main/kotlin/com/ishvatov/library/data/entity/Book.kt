package com.ishvatov.library.data.entity

import javax.persistence.*

@Entity
@Table(
        name = Book.TABLE_NAME,
        uniqueConstraints = [
            UniqueConstraint(name = "u_book_name", columnNames = ["name"])
        ]
)
class Book(
        id: Int?,
        @Column
        var name: String?,
        @Column
        var cnt: Int?,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "type_id", referencedColumnName = "id")
        var type: BookType
) : AbstractEntity(id) {
    companion object {
        const val TABLE_NAME = "books"
    }
}