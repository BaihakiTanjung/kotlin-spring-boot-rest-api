package io.github.baihakitanjung.playersapi.repository

import io.github.baihakitanjung.playersapi.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
    fun findByEmail(email: String): User?
}
