package com.ishvatov.library.data.vo

import com.ishvatov.library.data.entity.BookType

data class BookTypeVo(
        var id: Int?,
        var name: String?,
        var cnt: Int?,
        var dayCount: Int?,
        var fine: Double?
)

fun BookType.toVo(): BookTypeVo = BookTypeVo(id, name, cnt, dayCount, fine)