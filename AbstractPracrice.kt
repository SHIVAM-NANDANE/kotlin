
    abstract class Person(name: String) {
        init {
            println("My name is $name.")
        }

        fun displayId(id: Int) {
            println("My Id $id.")
        }

        abstract fun displayJob(description: String)
    }

    class Teacher(name: String): Person(name) {

        override fun displayJob(description: String) {
            println(description)
        }
    }

    fun main(args: Array<String>) {
        val ash = Teacher("Shivam")
        ash.displayJob("I'm Android Developer.")
        ash.displayId(4)
    }

