package com.laboratory.com.laboratory.config

import com.laboratory.model.Cat
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class CatConfiguration {

    @Bean
    open fun myBlackCat(): Cat {
        return Cat("Garfield")
    }

}