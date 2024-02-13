package array

/**
 * https://www.geeksforgeeks.org/find-minimum-difference-pair/
 */

/**
 * Input: {1, 5, 3, 19, 18, 25}
 * Output: 1
 * Explanation: Minimum difference is between 18 and 19
 */

// Returns minimum difference between any pair
fun findMinDiff(arr: IntArray, n: Int): Int {
    // Sort the array in ascending order using a loop
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    // Initialize difference as infinite
    var diff = arr[0]

    // Find the min diff by comparing adjacent
    // pairs in sorted array
    for (i in 0 until n - 1) {
        if (arr[i + 1] - arr[i] < diff) {
            diff = arr[i + 1] - arr[i]
        }
    }

    // Return min diff
    return diff
}

fun main() {
    val arr = intArrayOf(1, 5, 3, 19, 18, 25)

    // Function call
    println("Minimum Absolute Difference: ${findMinDiff(arr, arr.size)}")
}