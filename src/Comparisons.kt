fun main(args: Array<String>){

	val container1 = Container(0, "container")
	val container2 = Container(0, "container")
	println("container == container2: ${container1 == container2}")
	println("container === container2: ${container1 === container2}\n")

	val dataContainer1 = DataContainer(0, "data container")
	val dataContainer2 = DataContainer(0, "data container")
	println("dataContainer1 == dataContainer2: ${dataContainer1 == dataContainer2}")
	println("dataContainer1 === dataContainer2: ${dataContainer1 === dataContainer2}\n")

	val dataContainerA = DataContainer(1, "data container")
	val dataContainerB = dataContainerA
	println("dataContainerA == dataContainerB: ${dataContainerA == dataContainerB}")
	println("dataContainerA === dataContainerB: ${dataContainerA === dataContainerB}")
}

class Container(val a: Int,
				val b: String)

data class DataContainer(val a: Int,
						 val b: String)