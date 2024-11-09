fun eatCake() = println("Eat a Cake")
fun bakeCake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatCake()
        cakesEaten ++
    }

    do {
        bakeCake()
        cakesBaked ++
    } while (cakesBaked < cakesEaten)

}