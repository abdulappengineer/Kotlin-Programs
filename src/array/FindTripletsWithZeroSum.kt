package array

/**
 * Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
 * https://medium.com/@luckyudbhav/find-triplets-with-zero-sum-4786f743f251
 */

/**
 * Input: arr[] = {0, -1, 2, -3, 1}
 * Output: 0
 * Explanation: The triplets with zero-sum are 0 + -1 + 1 = 0 and 2 + -3 + 1 = 0
 * Then print 0 otherwise 1
 */

fun main() {
    val arr = intArrayOf(1, 2, -3, 4, -1, 0)
    val n = arr.size

    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            for (k in j + 1 until n) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    println("Result: 0")
                    return // Exit the program
                } else {
                    println("Result: 1")
                    return // Exit the program
                }
            }
        }
    }
}
