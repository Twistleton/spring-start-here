package com.laboratory

import com.laboratory.config.AppConfig
import com.laboratory.model.*
import org.springframework.beans.factory.config.BeanDefinitionCustomizer
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.util.function.Supplier


fun main() {

    // add configuration file to the application context
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)

    // check first and get instance by name
    if (context.containsBeanDefinition("parrot")) {
        val parrot = context.getBean("parrot", Parrot::class.java)
        println("${parrot.name} say hello")
    }

    // get instance by type
    val cat = context.getBean(Cat::class.java)
    println("${cat.name} say hello")

    // get instance by name
    val myBlackCat = context.getBean("myBlackCat", Cat::class.java)
    println("${myBlackCat.name} say hello")

    if (cat === myBlackCat) println("The same instance")

    val frog = context.getBean("kermit", Frog::class.java)

    println("${frog.name} say hello")

    val frog2 = context.getBean(Frog::class.java)

    // adding beans with stereotypes annotation to the Spring context

    // get Dolphin bean by type
    val dolphin = context.getBean(Dolphin::class.java)
    println("${dolphin.getName()} say hello")

    // programmatically adding beans to the Spring context

    val tiger = Tiger("Tiger")
    val tigerSupplier: Supplier<Tiger?> = Supplier { tiger }
    context.registerBean("tiger1", Tiger::class.java, tigerSupplier, BeanDefinitionCustomizer { bd -> bd.isPrimary = true })

    val receivedTiger = context.getBean("tiger1", Tiger::class.java)
    println("Received tiger: ${receivedTiger.name} say hello")

    println("* Show all beans:")

    context.beanDefinitionNames.forEach { println("  $it") }

    val factory = context.autowireCapableBeanFactory as BeanDefinitionRegistry?

    factory?.let {
        it.removeBeanDefinition("tiger1")
        println("Removed bean definition for tiger1")
    }

    context.beanDefinitionNames.forEach { println("  $it") }

    // wiring the beans using the @Bean annotated method’s parameters
    val cowboy = context.getBean("cowboy", Cowboy::class.java)
    println("${cowboy.name}'s horse is ${cowboy.getHorse()?.name}")

    // using @Qualifier annotation
    val dogOwner = context.getBean("dogOwner", DogOwner::class.java)
    println("${dogOwner.name}'s dog is ${dogOwner.getDog()?.name}")

}
