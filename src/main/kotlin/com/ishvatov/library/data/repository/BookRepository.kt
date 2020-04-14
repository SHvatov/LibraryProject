package com.ishvatov.library.data.repository

import com.ishvatov.library.data.entity.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<Book?, Int?>