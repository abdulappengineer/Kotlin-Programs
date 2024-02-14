package array

/**
 * https://www.digitizedpost.com/java-2d-array-find-max-number/
 */

fun findMaxValue(arr: Array<IntArray>): Int {
    var max = Int.MIN_VALUE
    for (row in arr) {
        for (item in row) {
            if (item > max) {
                max = item
            }
        }
    }
    return max
}
fun main() {
    val array = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    val maxValue = findMaxValue(array)
    println("Maximum value: $maxValue")
}
