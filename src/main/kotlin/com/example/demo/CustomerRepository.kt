package com.example.demo

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<CustomerEntity, Long> {

    @Query("SELECT c.firstName as firstName, c.lastName as lastName FROM customer c")
    fun findsByProjectedColumns(): List<CustomerProjection>
}
