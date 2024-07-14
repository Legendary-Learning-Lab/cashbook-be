package study.entity

// ? jakarta가 아닌 javax를 사용한 이유 → 호환성
// 패키지 등장 시점: javax -> jakarta
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long = 0,
    val userPassword: String,
    val userName: String,
    val userAge: Int,
    val userEmail: String,
    val gender: String,
    val agreement: Boolean,
)
