package com.laboratory

import com.laboratory.config.AppConfig
import com.laboratory.model.Cat
import com.laboratory.model.Dolphin
import com.laboratory.model.Frog
import com.laboratory.model.Parrot
import org.springframework.context.annotation.AnnotationConfigApplicationContext

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

    // get Dolphin bean by type
    val dolphin = context.getBean(Dolphin::class.java)
    println("${dolphin.getName()} say hello")

    context.beanDefinitionNames.forEach { println(it) }

}
