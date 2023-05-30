package com.mlc.my_little_cookie.user.domain

import com.mlc.my_little_cookie.common.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import javax.management.monitor.StringMonitor

@Entity
class User(
        @Id
        val id: String,
        val name: String,
        val email: String,
        val password: String,
        val image: String,
        @OneToMany(fetch = FetchType.LAZY)
        val pets: List<Pet>,
): BaseEntity() {
}