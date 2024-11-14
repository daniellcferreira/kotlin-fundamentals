class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int) {
    if (age < 16) {
        throw IllegalVoterException("$name não pode votar.")
    }
    println("Voto de $name realizado com Sucesso!")
}

fun main() {
    vote("Daniel", 25)
    vote("Maria", 15)
}