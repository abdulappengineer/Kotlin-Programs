package array

/**
 * https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
 */

/**
 * Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
 * Output: -12 -13 -5 -7 -3 -6 11 6 5
 */

fun moveNegativesToStart(arr: IntArray, n: Int) {
    var j = n - 1 // j holds the last position of the array

    for (i in n - 1 downTo 0) {
        if (arr[i] > 0) {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            j--
        }
    }
}

fun main() {
    val a = intArrayOf(-12, 11, -13, -5, 6, -7, 5, -3, -6)

    moveNegativesToStart(a, a.size)

    for (element in a) {
        print("$element ")
    }
}
