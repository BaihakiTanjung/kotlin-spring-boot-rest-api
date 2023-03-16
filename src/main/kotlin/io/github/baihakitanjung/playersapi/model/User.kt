package io.github.baihakitanjung.playersapi.model

import jakarta.persistence.*

@Entity
@Table(name = "player")
data class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
        val name: String,
        val email: String,
        val password: String,
)

// class User {
//     @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Int = 0

//     @Column var name = ""

//     @Column(unique = true) var email = ""

//     @Column
//     var password = ""
//         @JsonIgnore get() = field
//         set(value) {
//             val passwordEncoder = BCryptPasswordEncoder()
//             field = passwordEncoder.encode(value)
//         }

//     fun comparePassword(password: String): Boolean {
//         return BCryptPasswordEncoder().matches(password, this.password)
//     }
// }
