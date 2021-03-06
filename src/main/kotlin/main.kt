package todolist

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import spark.Spark.get
import todolist.TaskRepository

fun main(args: Array<String>){
	val objectMapper = ObjectMapper().registerKotlinModule()
	val jsonTransformer = JsonTransformer(objectMapper)
	val taskRepository = TaskRepository()
	val taskController = TaskController(taskRepository)

	get("/tasks", taskController.index(), jsonTransformer)
}