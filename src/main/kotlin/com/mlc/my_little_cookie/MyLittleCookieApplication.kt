package com.mlc.my_little_cookie

import jakarta.persistence.EntityListeners
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.domain.support.AuditingEntityListener

@EntityListeners(AuditingEntityListener::class)
@SpringBootApplication
class MyLittleCookieApplication

fun main(args: Array<String>) {
    runApplication<MyLittleCookieApplication>(*args)
}
