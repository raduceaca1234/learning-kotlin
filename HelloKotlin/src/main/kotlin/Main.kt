
fun getGreeting(): String = "Hello Kotlin"

fun sayHello() {
    println(getGreeting())
}

fun main(){
//    println("Hello World")
//    println(getGreeting())
//    sayHello()
    val interestingThings = arrayOf("Item1", "Item2", "Item3")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    interestingThings.forEachIndexed{index, s ->
        println("$s is at index $index")
    }
}