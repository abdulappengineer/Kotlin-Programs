package array

/**
 * https://www.javatpoint.com/java-program-to-print-the-smallest-element-in-an-array
 */

fun main() {
    val a = intArrayOf(5, 3, 2, 1, 6)
    var min = a[0]

    for (i in a.indices) {
        if (a[i] < min) {
            min = a[i]
        }
    }

    println("Min in array: $min")
}
