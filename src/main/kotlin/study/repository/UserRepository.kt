package study.repository

import org.springframework.data.jpa.repository.JpaRepository
import study.entity.UserEntity

interface UserRepository : JpaRepository<UserEntity, Long> {
}
