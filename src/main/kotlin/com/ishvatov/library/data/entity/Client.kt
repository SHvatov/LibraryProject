package com.ishvatov.library.data.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.UniqueConstraint

@Entity
@Table(
        name = Client.TABLE_NAME,
        uniqueConstraints = [
            UniqueConstraint(
                    name = "u_passport_series_number",
                    columnNames = ["passportSeries", "passportNumber"]
            )
        ]
)
class Client constructor(
        id: Int?,
        @Column
        var firstName: String?,
        @Column
        var lastName: String?,
        @Column
        var fatherName: String?,
        @Column
        var passportSeries: String?,
        @Column
        var passportNumber: String?
) : AbstractEntity(id) {
    companion object {
        const val TABLE_NAME = "clients"
    }
}