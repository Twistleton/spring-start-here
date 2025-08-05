package com.laboratory.model

class DogOwner(val name: String) {

    private var dog: Dog? = null

    fun getDog(): Dog? = dog

    fun setDog(dog: Dog) {
        this.dog = dog
    }

}