fun main(args: Array<String>){

	val primary = Primary(0, "Hi 0")
	primary.printMembers()

	val primaryExplicit = PrimaryExplicit(1, "Hi 1")
	primaryExplicit.printMembers()

	val primaryPrivate = PrimaryPrivate.create(2, "Hi 2")
	primaryPrivate.printMembers()

	val javaLikeDeclaration = JavaLikeDeclaration(3, "Hi 3")
	javaLikeDeclaration.printMembers()

	val primaryAndSecondary = PrimaryAndSecondary("Hi ", "4")
	primaryAndSecondary.printMembers()

	val primaryExtended = PrimaryExtended(5, "Hi ", "5")
	primaryExtended.printMembers()
}


class Primary(private val param1: Int,
			  private val param2: String){

	fun printMembers() = println("Primary: $param1, $param2")
}

class PrimaryExplicit constructor(private val param1: Int,
								  private val param2: String){

	fun printMembers() = println("PrimaryExplicit: $param1, $param2")
}

class PrimaryPrivate private constructor(private val param1: Int,
										 private val param2: String){

	//Kotlin does not have static members.
	companion object {

		@JvmStatic // This annotation is optional. More details here: https://stackoverflow.com/a/40352734/1369016
		fun create(param1: Int,
				   param2: String) = PrimaryPrivate(param1, param2)
	}

	fun printMembers() = println("PrimaryPrivate: $param1, $param2")
}

//Not recommended because of code repetition
class JavaLikeDeclaration{

	private val param1: Int
	private val param2: String

	constructor(param1: Int,
				param2: String){

		this.param1 = param1
		this.param2 = param2
	}

	fun printMembers() = println("JavaLikeDeclaration: $param1, $param2")
}

class PrimaryAndSecondary(private val param1: Int,
						  private val param2: String){

	constructor(stringA: String,
				stringB: String) : this(4, stringA + stringB) {

		print("Secondary constructor called! ")
	}

	fun printMembers() = println("PrimaryAndSecondary: $param1, $param2")
}


class PrimaryExtended(param1: Int,
					  paramA: String,
					  paramB: String): PrimarySealed(param1, paramA + paramB)

//sealed classes are also abstract
sealed class PrimarySealed(private val param1: Int,
						   private val param2: String){

	fun printMembers() = println("PrimarySealed: $param1, $param2")
}