package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val customerRepository: CustomerRepository
) {

    @GetMapping("/customers")
    fun getCustomers(): MutableIterable<CustomerEntity> {
        return customerRepository.findAll()
    }

    @GetMapping("/projection")
    fun getCustomersProjection(): List<CustomerProjection> {
        return customerRepository.findsByProjectedColumns()
    }
}