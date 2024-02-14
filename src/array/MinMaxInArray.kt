package array

/**
 * https://www.geeksforgeeks.org/how-to-get-largest-and-smallest-number-in-an-array/
 */

/**
 * Input: {1, 2, 3, 4, 5}
 * Output: Maximum is: 5
 * Minimum is: 1
 */

fun main() {
    val arr = intArrayOf(5, 2, 9, 1, 5, 6)
    var min = arr[0]
    var max = arr[0]

    for (element in arr) {
        if (element < min) {
            min = element
        }
        if (element > max) {
            max = element
        }
    }

    println("The smallest element in the array is: $min")
    println("The largest element in the array is: $max")
}
