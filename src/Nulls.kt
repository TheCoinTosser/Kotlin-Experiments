fun main(args: Array<String>){

	val homelessUser = User("Homeless", null)
	printUser(homelessUser)

	val userWithAddress = User("Settled", Address("Queen Street"))
	printUser(userWithAddress)

	printElvis(homelessUser)
	printElvis(userWithAddress)
}

class User(val name: String,
		   val address: Address?)

class Address(val street: String)

private fun printUser(user: User) = println("${user.name} street is: ${user.address?.street}")
private fun printElvis(user: User) = println("Elvis operator for ${user.name}: ${user.address?.street ?: "No street"}")
