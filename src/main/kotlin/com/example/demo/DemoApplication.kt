package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {

    @Bean
    fun init(customerRepository: CustomerRepository) = CommandLineRunner {
        customerRepository.save(CustomerEntity(1, "John", "Doe"))
        customerRepository.save(CustomerEntity(2, "Jane", "Doe"))
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
