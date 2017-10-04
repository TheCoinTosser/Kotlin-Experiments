fun main(args: Array<String>){

	genericMethod(object: InterfaceWith2Methods {

		override fun methodA() {
			println("methodA called!")
		}

		override fun methodB(){
			println("methodB called!")
		}
	})

	MySingleton.invoke()

	genericMethod2(object : FunctionalInterface{

		override fun method() {
			println("method called!")
		}
	})
}

fun genericMethod(myInterface: InterfaceWith2Methods){

	myInterface.methodA()
	myInterface.methodB()
}

interface InterfaceWith2Methods {
	fun methodA()
	fun methodB()
}

//a.k.a. object declaration
object MySingleton{

	fun invoke(){

		println("invoke called!")
	}
}

interface FunctionalInterface{
	fun method()
}

fun genericMethod2(functionalInterface: FunctionalInterface){

	functionalInterface.method()
}