
fun getGreeting(): String = "Hello Kotlin"

fun sayHello() {
    println(getGreeting())
}

fun main(){
    val interestingThings = arrayOf("Item1", "Item2", "Item3")
    val interestingThings2 = listOf("Item1", "Item2", "Item3")
    val interestingThings3 = mutableListOf("Item1", "Item2", "Item3")
    interestingThings3.add("Dogs")
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val map2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map2.put(4, "d")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    interestingThings.forEachIndexed{index, s ->
        println("$s is at index $index")
    }

    interestingThings2.forEach{interestingThing->
        println(interestingThing)
    }

    map.forEach{key, value -> println("$key -> $value")}



}