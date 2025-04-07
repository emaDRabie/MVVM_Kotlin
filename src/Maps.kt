fun main() {
    // Map: a collection of key-value pairs.
    // Keys must be unique, but values can be duplicated.
    val userPhones = mutableMapOf(
        "Ahmed" to "01062500807",
        "Emad" to "01115424444",
        "Sara" to "01062050007"
    )

    println(userPhones)
    userPhones["Emad"] = "020" // Updates Emad's number
    userPhones["Laila"] = "01062050007" // Adds new entry with duplicate value
    println(userPhones)

}