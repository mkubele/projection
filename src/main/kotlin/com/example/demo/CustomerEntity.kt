package com.example.demo

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "customer")
data class CustomerEntity(
    @Id
    val id: Long,
    val firstName: String,
    val lastName: String
)
