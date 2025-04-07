fun main() {

    /* Set: A collection of unique element
     (can also be mutable {variable size} or immutable {fixed size}).
    // Redundancy: Does NOT allow duplicates*/

    val phones = mutableSetOf("01115429678", "01062010807", "01062010807", "01013871559")
    phones.add("020")
    println(phones)

    println(phones.elementAt(1))

    val names1 = setOf("Emad", "Rabie")
    val names2 = setOf("Rabie", "Ramadan")
    println((names1 + names2))
}