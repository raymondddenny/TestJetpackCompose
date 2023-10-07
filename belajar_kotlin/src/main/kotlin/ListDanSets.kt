fun main() {
    val readOnlyList = listOf<String>("Misael", "Denny", "Aping", "Jetli", "Jero")

    val mutableList: MutableList<String> = mutableListOf("Denny", "Aping")

    mutableList.add("Jero")
    mutableList.add("Misael")
    mutableList.add("Jetli")

    println("mutable list -> ${mutableList}")

    val readOnlyMap = mapOf(1 to 100, 2 to 100)
    println(readOnlyMap)

    val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)
    println("The first value in the map is: ${readOnlyAccountBalances[1]}")
}