package array

/**
 *  How to sort an array in a single loop?
 */

fun sortArrayWithSingleLoop(arr: IntArray) {
    val n = arr.size
    var i = 0

    while (i < n - 1) {
        if (arr[i] > arr[i + 1]) {
            // Swap arr[i] and arr[i + 1]
            val temp = arr[i]
            arr[i] = arr[i + 1]
            arr[i + 1] = temp
            i = 0 // Start from the beginning of the array
        } else {
            i++
        }
    }
}

fun main() {
    val arr = intArrayOf(5, 2, 9, 3, 6)
    sortArrayWithSingleLoop(arr)
    for (item in arr) {
        print("$item ")
    }
}
// println("Sorted Array: ${arr.joinToString(", ")}")
