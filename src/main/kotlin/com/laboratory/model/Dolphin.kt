package com.laboratory.model

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class Dolphin() {

    private var name: String? = null

    @PostConstruct
    fun init() {
        name = "Flipper"
        println("Dolphin initialized with name: $name")
    }

    fun getName(): String = name ?: "Dolphin"

}
