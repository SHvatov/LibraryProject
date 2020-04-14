package com.ishvatov.library.data.entity

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = Journal.TABLE_NAME)
class Journal(
        id: Int?,
        @Column
        var dateBegin: LocalDate?,
        @Column
        var dateEnd: LocalDate?,
        @Column
        var dateReturn: LocalDate?,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "book_id", referencedColumnName = "id")
        var book: Book?,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "client_id", referencedColumnName = "id")
        var client: Client?
) : AbstractEntity(id) {
    companion object {
        const val TABLE_NAME = "journal"
    }
}