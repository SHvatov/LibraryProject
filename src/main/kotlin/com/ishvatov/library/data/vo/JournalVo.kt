package com.ishvatov.library.data.vo

import com.ishvatov.library.data.entity.Journal
import java.time.LocalDate

data class JournalVo(
        val id: Int?,
        var dateBegin: LocalDate?,
        var dateEnd: LocalDate?,
        var dateReturn: LocalDate?,
        var bookId: Int?,
        var clientId: Int?
)

fun Journal.toVo(): JournalVo = JournalVo(id, dateBegin, dateEnd, dateReturn, book?.id, client?.id)