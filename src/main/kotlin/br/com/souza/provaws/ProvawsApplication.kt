package br.com.souza.provaws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProvawsApplication

fun main(args: Array<String>) {
	runApplication<ProvawsApplication>(*args)
}
