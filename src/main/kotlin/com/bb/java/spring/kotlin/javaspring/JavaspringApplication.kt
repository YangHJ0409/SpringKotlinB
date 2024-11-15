package com.bb.java.spring.kotlin.javaspring

import org.apache.juli.logging.Log
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JavaspringApplication

const val LOG = true
fun main(args: Array<String>) {
	runApplication<JavaspringApplication>(*args)
	if (LOG) println("Kotlin::Hello World!!!")
}
