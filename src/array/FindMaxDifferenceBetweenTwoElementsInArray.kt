package array

/**
 * https://www.geeksforgeeks.org/maximum-difference-between-two-elements-in-an-array/
 */

/**
 * Input: arr[] = {2, 1, 5, 3}
 * Output: 4
 * |5 – 1| = 4
 */

fun findMaxDifference(arr: IntArray): Int {
    var max = arr[0]
    var min = arr[0]

    for (element in arr) {
        if (element > max) {
            max = element
        }

        if (element < min) {
            min = element
        }
    }
    return max - min
}

fun main() {
    val arr = intArrayOf(2, 1, 5, 3)

    val maxDifference = findMaxDifference(arr)

    println("Maximum difference: $maxDifference")
}
