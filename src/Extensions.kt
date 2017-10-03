import java.math.BigInteger

fun main(args: Array<String>){

	println("Extension functions")
	println("7.isEven(): ${7.isEven()}")
	println("7.isOdd(): ${7.isOdd()}")

	println("\nExtension properties")
	println("BigDecimal: ${7.bi}")
}

private val Int.bi: BigInteger
	get() = BigInteger.valueOf(this.toLong())

fun Int.isEven() = this % 2 == 0
fun Int.isOdd() = !isEven()
