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
    private var _userId: Long = 0,

    @Column(name = "user_password", nullable = false, unique = false)
    private var _userPassword: String,

    @Column(name = "user_name", nullable = false, unique = false)
    private var _userName: String,

    @Column(name = "user_age", nullable = false)
    private var _userAge: Int,

    @Column(name = "user_email", nullable = false, unique = true)
    private var _userEmail: String,

    @Column(name = "gender", nullable = false)
    private var _gender: UserGender,

    @Column(name = "agreement", nullable = false)
    private var _agreement: Boolean,
) {
    // TODO: Controller 구성하게 될 때 필요한 부분만 재구성
    // ? 작성 예시를 위해 생성한 커스텀 getter
    val userPassword: String
        get() {
            return _userPassword
        }
}
