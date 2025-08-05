package com.laboratory.config

import com.laboratory.model.Dog
import com.laboratory.model.DogOwner
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean

class DogOwnerDogConfiguration {

    @Bean
    open fun dog1(): Dog {
        return Dog("Preston")
    }

    @Bean
    open fun dog2(): Dog {
        return Dog("Gromit")
    }

    @Bean
    open fun dog3(): Dog {
        return Dog("Waldi")
    }

    @Bean
    open fun dogOwner(@Qualifier("dog2")  dog: Dog): DogOwner {
        val dogOwner = DogOwner("Wallace")
        dogOwner.setDog(dog)
        return dogOwner
    }

}