import spark.Spark.get

fun main(args: Array<String>) {
	get("/Hello") {
		request, response -> "Hello, World!"
	}
}