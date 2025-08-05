package com.laboratory.config

import com.laboratory.model.Horse
import com.laboratory.model.Cowboy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
open class CowboyHorseConfiguration {

    @Bean
    open fun horse(): Horse {
        return Horse("Jolly Jumper")
    }

    @Bean
    open fun cowboy(horse: Horse): Cowboy {
        val p = Cowboy("Lucky Luck")
        p.setHorse(horse)
        return p
    }

}