package study.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import study.enum.UserGender

@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long = 0,

    @Column(name = "user_password", nullable = false, unique = false)
    val userPassword: String,

    @Column(name = "user_name", nullable = false, unique = false)
    val userName: String,

    @Column(name = "user_age", nullable = false)
    val userAge: Int,

    @Column(name = "user_email", nullable = false, unique = true)
    val userEmail: String,

    @Column(name = "gender", nullable = false)
    val gender: UserGender,

    @Column(name = "agreement", nullable = false)
    val agreement: Boolean,
)
