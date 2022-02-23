fun main(args: Array<String>) {
    // variable declared as nullable
    var firstName: String? = "Shivam"
    var lastName: String? = null

    println(firstName?.toUpperCase())
    println(firstName?.length)
    println(lastName?.toUpperCase())
}