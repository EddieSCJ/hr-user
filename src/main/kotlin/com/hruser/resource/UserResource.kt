package com.hruser.resource

import com.hruser.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource(
    val userRepository: UserRepository
) {
    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long) = userRepository.findById(id)

    @GetMapping("/email/{email}")
    fun findByEmail(@PathVariable("email") email: String) = userRepository.findByEmail(email)
}