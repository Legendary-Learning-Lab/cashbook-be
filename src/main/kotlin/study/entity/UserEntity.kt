package study.entity

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long = 0,

    @Column(nullable = false, unique = false)
    val userPassword: String,

    @Column(nullable = false, unique = false)
    val userName: String,

    @Column(nullable = false)
    val userAge: Int,

    @Column(nullable = false, unique = true)
    val userEmail: String,

    @Column(nullable = false)
    val gender: String,

    @Column(nullable = false)
    val agreement: Boolean,
)
