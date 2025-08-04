package com.laboratory.config

import com.laboratory.model.Frog
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
open class FrogConfiguration {

    @Bean("kermit")
    open fun frog(): Frog {
        return Frog("Kermit")
    }

    @Bean
    @Primary
    open fun frog2(): Frog {
        return Frog("Quaki")
    }

    @Bean
    open fun frog3(): Frog {
        return Frog("Quaki")
    }

}