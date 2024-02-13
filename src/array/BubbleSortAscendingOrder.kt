package array

/**
 *https://www.geeksforgeeks.org/java-program-for-bubble-sort/
 */

fun bubbleSortAsc(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}

fun main() {
    val arr = intArrayOf(5, 2, 9, 1, 5, 6)
    bubbleSortAsc(arr)

    // Print the sorted array
    println("Sorted Array in Ascending Order: ")
    for (element in arr) {
        print("$element ")
    }
}