package array

/**
 * https://www.geeksforgeeks.org/find-the-missing-number/
 */

/**
 * Input: 5, 3, 1, 2
 * Output: 4
 */

fun missingNumber(arr: IntArray): Int {
    val n = arr.size + 1 // need to execute +1 length of array
    val numberSum = n * (n + 1) / 2
    var arraySum = 0

    for (i in arr.indices) {
        arraySum += arr[i]
    }

    val missingNumber = numberSum - arraySum
    return missingNumber
}

fun main() {
    val arr = intArrayOf(5, 3, 1, 2)
    println("Missing number from array: ${missingNumber(arr)}")
}

