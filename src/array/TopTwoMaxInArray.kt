package array

/**
 * https://www.studytonight.com/java-programs/java-program-to-find-the-largest-two-numbers-in-a-given-array
 */

/**
 * Input: {1, 5, 2, 4, 3}
 * Output: First largest = 5
 * Output: Second largest = 4
 */

fun findTopTwoMax(arr: IntArray) {
    var max1 = arr[0]
    var max2 = arr[0]

    for (i in arr.indices) {
        if (arr[i] > max1) {
            max2 = max1
            max1 = arr[i]
        } else if (arr[i] > max2 && arr[i] != max1) {
            max2 = arr[i]
        }
    }

    println("Max1: $max1")
    println("Max2: $max2")
}

fun main() {
    val arr = intArrayOf(1, 5, 2, 4, 3)
    findTopTwoMax(arr)
}