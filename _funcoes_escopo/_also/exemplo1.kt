data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}

fun main() {

    val jake = Person("Jake", 30, "Android developer")
        .also {
            writeCreationLog(it)
        }
}
