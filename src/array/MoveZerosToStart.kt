package array

/**
 * https://www.geeksforgeeks.org/move-all-zeros-to-start-and-ones-to-end-in-an-array-of-random-integers/
 */

/**
 * Input: {1, 2, 0, 4, 3, 0, 5, 0}
 * Output: 0 0 0 2 4 3 5 1
 */

fun moveZeroesToStart(arr: IntArray) {
    // assign last element
    var j = arr.size - 1
    for (i in arr.size - 1 downTo 0) {
        if (arr[i] != 0) {
            val temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp
            j--
        }
    }
}

fun main() {
    val arr = intArrayOf(1, 0, 2, 0, 3, 4, 0, 5)
    moveZeroesToStart(arr)
    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
    /*for (item in arr) {
        print("$item ")
    }*/
}
