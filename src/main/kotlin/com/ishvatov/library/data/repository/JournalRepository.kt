package com.ishvatov.library.data.repository

import com.ishvatov.library.data.entity.Journal
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JournalRepository : JpaRepository<Journal?, Int?>