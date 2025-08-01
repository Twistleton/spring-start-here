package com.laboratory

import com.laboratory.com.laboratory.config.CatConfiguration
import com.laboratory.config.ParrotConfiguration
import com.laboratory.model.Cat
import com.laboratory.model.Parrot
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {

    val context = AnnotationConfigApplicationContext(ParrotConfiguration::class.java, CatConfiguration::class.java)

    val perrot = context.getBean(Parrot::class.java)
    println("${perrot.name} say hello")

    val cat = context.getBean(Cat::class.java)
    println("${cat.name} say hello")

    val myBlackCat = context.getBean("myBlackCat", Cat::class.java)
    println("${myBlackCat.name} say hello")

    if (cat === myBlackCat) println("The same instance")

    context.beanDefinitionNames.forEach { println(it) }

}