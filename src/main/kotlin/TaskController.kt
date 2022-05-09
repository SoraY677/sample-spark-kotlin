package todolist

import spark.Request
import spark.Response
import spark.Route

class TaskController(private val taskRepository: TaskRepository){
	fun index(): Route = object :Route{
		override fun handle(p0: Request, p1: Response): Any = 
			taskRepository.findAll()
			// listOf(
			// 	Task(1, "クリーニングに出す", false),
			// 	Task(2, "住民票を出す", true)
			// )
	}
}