data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User("Shivam", 22)
    println("name = ${jack.name}")
    println("age = ${jack.age}")
}