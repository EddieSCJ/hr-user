package com.hruser.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
class Configs {
    @Bean
    fun bcryptEncoder() = BCryptPasswordEncoder()
}