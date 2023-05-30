package com.mlc.my_little_cookie.user.repository

import com.mlc.my_little_cookie.user.domain.Pet
import org.springframework.data.jpa.repository.JpaRepository

interface PetRepository: JpaRepository<Pet, String>{
}