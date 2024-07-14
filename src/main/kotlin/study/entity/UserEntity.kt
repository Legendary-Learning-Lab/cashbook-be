package study.entity

// ? jakarta가 아닌 javax를 사용한 이유 → 호환성
// 패키지 등장 시점: javax -> jakarta
import study.enum.UserGender
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
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
    val gender: UserGender,

    @Column(nullable = false)
    val agreement: Boolean,
)
