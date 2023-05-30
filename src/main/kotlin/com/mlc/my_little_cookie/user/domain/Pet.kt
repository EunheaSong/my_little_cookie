package com.mlc.my_little_cookie.user.domain

import com.mlc.my_little_cookie.common.BaseEntity
import jakarta.persistence.*

@Entity
class Pet(
        @Id
        val id: String,
        val name: String,
        val age: Int,
        val type: Type,
        val image: String,
        val isRainbowBridge: Boolean,
        @ManyToOne(fetch = FetchType.LAZY)
        val user: User,
): BaseEntity() {

    enum class Type(val value: String){
        CAT("고양이"),
        DOG("개"),

    }
}