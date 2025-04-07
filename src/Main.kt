fun main() {
    // array: A fixed-size container that holds elements of the same type.
    // Redundancy: Allows duplicates

    val numbers = arrayOf<Int>(10, 10, 20, 30)
    for (number in numbers)
        print("$number \t")
    println("\n${numbers.toList()}")

}
