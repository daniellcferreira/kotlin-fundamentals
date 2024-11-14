fun main() {

    val a = 10
    val b = 0

    val divisao : Int? = try { a/b } catch (e: ArithmeticException) { null }
    println(divisao) 

}