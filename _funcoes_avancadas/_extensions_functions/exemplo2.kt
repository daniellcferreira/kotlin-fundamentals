fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

fun main() {
    
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}