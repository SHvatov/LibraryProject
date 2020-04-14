package com.ishvatov.library.data.repository

import com.ishvatov.library.data.entity.BookType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookTypeRepository : JpaRepository<BookType?, Int?>