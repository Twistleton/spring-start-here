package com.laboratory.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@ComponentScan("com.laboratory.model")
@Import(ParrotConfiguration::class, FrogConfiguration::class, CatConfiguration::class, CowboyHorseConfiguration::class)
open class AppConfig
