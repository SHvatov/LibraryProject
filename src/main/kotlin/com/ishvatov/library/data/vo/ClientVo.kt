package com.ishvatov.library.data.vo

import com.ishvatov.library.data.entity.Client

data class ClientVo(
        val id: Int?,
        var firstName: String?,
        var lastName: String?,
        var fatherName: String?,
        var passportSeries: String?,
        var passportNumber: String?
)

fun Client.toVo(): ClientVo = ClientVo(id, firstName, lastName, fatherName, passportSeries, passportNumber)