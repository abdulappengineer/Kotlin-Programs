package string

/**
 * https://www.geeksforgeeks.org/java-program-to-swap-two-strings-without-using-any-third-variable/
 */

fun main() {
    var str1 = "Hello"
    var str2 = "World"

    // Swapping without using a third variable
    str1 = str1 + str2
    str2 = str1.substring(0, str1.length - str2.length)
    str1 = str1.substring(str2.length)

    println("\nAfter swapping:")
    println("String 1: $str1")
    println("String 2: $str2")
}
