class Customer

class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()

    var contact = Contact(1, "exemplo@gmail.com")

    println(contact.id)
    println(contact.email)
    
    contact.email = "exemplo2@gmail.com"
    println(contact.email)

}