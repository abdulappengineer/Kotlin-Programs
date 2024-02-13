package array

/**
 * https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/
 */

/**
 * Input:  arr[] = {12, 13, 1, 10, 34, 1}
 * Output: The smallest element is 1 and
 *         second-Smallest element is 10
 */

fun main() {
    val arr = intArrayOf(2, 5, 1, 7, 3, 9)
    var smallest = arr[0]
    var secondSmallest = arr[0]

    for (i in 0 until arr.size) {
        if (arr[i] < smallest) {
            secondSmallest = smallest
            smallest = arr[i]
        } else if (arr[i] < secondSmallest && arr[i] != smallest) {
            secondSmallest = arr[i]
        }
    }

    println("Smallest element is: $smallest")
    println("Second smallest element is: $secondSmallest")
}
