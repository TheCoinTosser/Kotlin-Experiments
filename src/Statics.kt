class Statics {

	companion object {

		const val TAU = 2 * Math.PI

		var numOfInstances = 0

		fun staticMethod(){
			println("staticMethod() called!")
		}
	}

	init {
		numOfInstances++
	}
}

fun main(args: Array<String>){

	println("Constant TAU: ${Statics.TAU}")

	Statics()
	Statics()
	println("Number of objects created: ${Statics.numOfInstances}")

	Statics.staticMethod()
}