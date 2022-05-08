import spark.Spark.get

fun main(args: Array<String>) {
	get("/Hello") {
		request, response -> 
			val name:String = request.queryParams("name") ?: "World"
			"Hello, ${name}"
	}
}