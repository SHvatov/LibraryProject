package com.ishvatov.library.data.repository

import com.ishvatov.library.data.entity.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository : JpaRepository<Client?, Int?>