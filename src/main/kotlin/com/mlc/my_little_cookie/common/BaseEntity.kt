package com.mlc.my_little_cookie.common

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

open class BaseEntity{
        @CreatedDate
        val createdAt: LocalDateTime = LocalDateTime.now()
        @LastModifiedDate
        val updatedAt: LocalDateTime = LocalDateTime.now()
        val isDeleted: Boolean = false
}