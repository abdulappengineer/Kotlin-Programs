package array

/**
 * https://www.geeksforgeeks.org/java-program-for-leaders-in-an-array/
 */

/**
 * Write a program to print all the LEADERS in the array.
 * An element is leader if it is greater than all the elements to its right side.
 * And the rightmost element is always a leader.
 * For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 * Let the input array be arr[] and size of the array be size.
 */

/**
 * Input: arr = 16, 17, 4, 3, 5,
 * Output: 17, 5, 2
 *
 * Input: arr = 1, 2, 3, 4, 5, 2
 * Output: 5, 2
 *
 */

fun findTheLeaders(arr: IntArray) {
    // Getting the length of the input array
    val n = arr.size

    // Assuming the last element as max
    var max = arr[n - 1]   // max_from_right

    print("Leaders elements in the array: ")
    // Printing the last element as it is always a leader
    print("${arr[n - 1]} ")

    // Traversing the remaining elements from right to left
    for (i in n - 2 downTo 0) {
        // If the element is greater than max
        if (arr[i] > max) {
            // Updating the max
            max = arr[i]
            // Printing the element
            print("${arr[i]} ")
        }
    }
    println()
}

fun main() {
    val arr = intArrayOf(16, 17, 4, 3, 5, 2)
    findTheLeaders(arr)
}