package com.ishvatov.library.data.vo

import com.ishvatov.library.data.entity.Book

data class BookVo(
        var id: Int?,
        var name: String?,
        var cnt: Int?,
        var typeId: Int?
)

fun Book.toVo(): BookVo = BookVo(id, name, cnt, type.id)