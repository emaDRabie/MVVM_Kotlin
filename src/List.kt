fun main() {

    // list: An ordered collection (can be mutable or immutable).
    // Redundancy: Allows duplicates

    val names = listOf<Int>(10, 20, 30, 40)
    println(names)
    for (name in names)
        println(name)
    println("")

    val myList = names.listIterator()
    while (myList.hasNext()) {
        println(myList.next())
    }

    names.forEach {
        if (it % 3 == 0)
            println(it)
    }

    println("#######")

    println(names.contains(10))


}