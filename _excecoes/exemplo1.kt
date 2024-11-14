fun main() {

    val a = 10
    val b = 0

    try {
        val divisao = a / b
        println(divisao)
    }
    catch(e: ArithmeticException) {
        println("Ocorreu um exceção aritimetica.")
    } catch(e: Throwable) {
        println(e.message)
    } finally {
        println("Finally executado!")
    }
}