package numbers

/**
 * Write a program to check number is even or odd using extension function in kotlin.
 */

fun Int.isEven(): Boolean {
    return this % 2 == 0
}
// Using single statement
// fun Int.isEven(): Boolean = this % 2 == 0
fun main() {
    println("Enter the number:")
    val number = readLine()?.toIntOrNull()
    number?.let {
        if (number.isEven()) {
            println("$number is even.")
        } else {
            println("$number is odd.")
        }
    }
}
