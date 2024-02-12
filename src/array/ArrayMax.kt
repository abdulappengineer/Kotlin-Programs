package array

/**
 * https://www.geeksforgeeks.org/java-program-for-program-to-find-largest-element-in-an-array/
 */

fun main() {
    val a = intArrayOf(5, 3, 1, 2, 6)
    var max = a[0]

    for (i in a.indices) {
        if (a[i] > max) {
            max = a[i]
        }
    }
    println("Max in array: $max")
}
