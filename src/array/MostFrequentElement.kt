package array

/**
 * https://www.geeksforgeeks.org/frequent-element-array/
 */

/**
 * Input : arr = 1, 3, 2, 1, 4, 1
 * Output : 1
 */

fun findMostFrequentElement(arr: IntArray, n: Int): Int {
    var maxCount = 0
    var maxFreqElement = 0

    for (i in 0 until n) {
        var count = 0

        for (j in 0 until n) {
            if (arr[i] == arr[j]) {
                count++
            }
        }

        if (count > maxCount) {
            maxCount = count
            maxFreqElement = arr[i]
        }
    }

    return maxFreqElement
}

fun main() {
    val arr = intArrayOf(4, 5, 8, 7, 4, 7, 6, 7)
    val n = arr.size
    val mostFrequentElement = findMostFrequentElement(arr, n)
    println("Most frequent element: $mostFrequentElement")
}