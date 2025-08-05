package com.laboratory.model

class Cowboy(val name: String) {

    private var horse: Horse? = null

    fun getHorse(): Horse? = horse

    fun setHorse(horse: Horse) {
        this.horse = horse
    }

}


