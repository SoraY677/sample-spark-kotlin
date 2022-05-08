package todolist

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import spark.Spark.get

fun main(args: Array<String>){
	val objectMapper = ObjectMapper().registerKotlinModule()
	val hoge = "hoge"
	get("/tasks", 
	{ req, res -> listOf(
		Task(1, "クリーニングに出す", false),
		Task(2, "住民票を出す", true)
	)}, 
	objectMapper::writeValueAsString
	)
}