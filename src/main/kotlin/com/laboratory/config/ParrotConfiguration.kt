package com.laboratory.config

import com.laboratory.model.Parrot
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ParrotConfiguration {

    @Bean
    open fun parrot(): Parrot {
        return Parrot("Blue")
    }

}