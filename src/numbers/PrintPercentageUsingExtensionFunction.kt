package numbers

/**
 * Write a program to print percentage using extension function in kotlin.
 */

/**
 * Input: val a = "122,9999.00"
 */

fun String.calculatePercentage(percent: Double): Double {
    val cleanString = this.replace(",", "") // Remove commas, if any
    val number = cleanString.toDouble()
    return number * (percent / 100.0)

}

fun main() {
    val a = "122,9999.00"
    val percentage = 15.0 // Change this value to the desired percentage

    val result = a.calculatePercentage(percentage)
    println(result)
}
