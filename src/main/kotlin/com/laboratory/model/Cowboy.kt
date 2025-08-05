package com.laboratory.model

class Cowboy(val name: String) {

    init {
        println("Cowboy initialized with name: $name")
    }

    private var horse: Horse? = null

    fun getHorse(): Horse? = horse

    fun setHorse(horse: Horse) {
        this.horse = horse
    }

}


