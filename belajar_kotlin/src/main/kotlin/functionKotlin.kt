fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun decreaseValue(num1: Int, num2: Int = 1): Int {
    return num1 - num2
}


fun main() {
    println(sum(1, 2))

    println(sum(num1 = 1, num2 = 5))

    println(decreaseValue(1))
}