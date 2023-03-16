package io.github.baihakitanjung.playersapi.model

import jakarta.persistence.*

@Entity
@Table(name = "player")
data class Player(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
        val name: String,
        val age: Int,
        val nationality: String
)
