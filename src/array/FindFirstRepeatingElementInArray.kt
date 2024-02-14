package array

/**
 * https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/
 */

/**
 * Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
 * Output: 5
 * Explanation: 5 is the first element that repeats
 */

fun findFirstDuplicate(arr: IntArray): Int {
    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                return arr[i]
            }
        }
    }
    return -1 // Return -1 if no duplicate is found
}

fun main() {
    val arr = intArrayOf(10, 5, 3, 4, 3, 5, 6)

    println("First duplicate element: ${findFirstDuplicate(arr)}")
}