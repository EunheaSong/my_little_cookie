package com.mlc.my_little_cookie

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
class Pet(
        @Id
        val id: String,
        val name: String,
        val age: Int,
        val type: Type,
        val image: String,
        val isRainbowBridge: Boolean,
) {
    val createdAt: LocalDateTime = LocalDateTime.now()
    val updatedAt: LocalDateTime = LocalDateTime.now()

    enum class Type(val value: String){
        CAT("고양이"),
        DOG("개"),

    }
}