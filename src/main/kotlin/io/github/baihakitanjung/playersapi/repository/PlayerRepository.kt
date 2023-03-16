package io.github.baihakitanjung.playersapi.repository

import io.github.baihakitanjung.playersapi.model.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository interface PlayerRepository : JpaRepository<Player, Long>
