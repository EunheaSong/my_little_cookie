package com.mlc.my_little_cookie.user.repository

import com.mlc.my_little_cookie.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, String> {
}