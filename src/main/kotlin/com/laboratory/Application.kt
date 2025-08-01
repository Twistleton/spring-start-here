package com.laboratory

import com.laboratory.config.CatConfiguration
import com.laboratory.config.ParrotConfiguration
import com.laboratory.model.Cat
import com.laboratory.model.Parrot
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    // add configuration files to the application context
    val context = AnnotationConfigApplicationContext(ParrotConfiguration::class.java, CatConfiguration::class.java)

    // get by type
    val perrot = context.getBean(Parrot::class.java)
    println("${perrot.name} say hello")

    // get by type
    val cat = context.getBean(Cat::class.java)
    println("${cat.name} say hello")

    // get by name
    val myBlackCat = context.getBean("myBlackCat", Cat::class.java)
    println("${myBlackCat.name} say hello")

    if (cat === myBlackCat) println("The same instance")

    context.beanDefinitionNames.forEach { println(it) }

}