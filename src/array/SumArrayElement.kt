package array

/**
 * https://www.geeksforgeeks.org/java-program-to-find-sum-of-array-elements/
 */

/**
 * Input :  1, 3, 3, 4, 5
 * Output : 15
 */

fun main() {
    // Initialize array
    val arr = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0

    // Loop through the array to calculate sum of elements
    for (i in arr.indices) {
        sum += arr[i]
    }

    println("Sum of array element is: $sum") // prints 15
}

