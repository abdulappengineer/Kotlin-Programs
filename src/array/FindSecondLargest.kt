package array

/**
 * https://www.geeksforgeeks.org/find-second-largest-element-array/
 */

/**
 * Input: arr[] = {12, 35, 1, 10, 34, 1}
 * Output: The second-largest element is 34.
 * Explanation: The largest element of the array is 35 and the second-largest element is 34
 */

/**
 * Input: arr[] = {10, 5, 10}
 * Output: The second-largest element is 5.
 * Explanation: The largest element of the array is 10 and the second-largest element is 5
 */

fun findSecondLargest(arr: IntArray): Int {
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    for (item in arr) {
        if (item > largest) {
            secondLargest = largest
            largest = item
        } else if (item > secondLargest && item != largest) {
            secondLargest = item
        }
    }
    return secondLargest
}
fun main() {
    val arr = intArrayOf(10, 5, 10)
    val secondLargest = findSecondLargest(arr)
    println("Second largest element is $secondLargest")
}
