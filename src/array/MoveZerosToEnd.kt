package array

/**
 * https://www.geeksforgeeks.org/move-zeroes-end-array/
 */

/**
 * Input:  {1, 2, 0, 4, 3, 0, 5, 0};
 * Output:  1, 2, 4, 3, 5, 0, 0, 0
 */

fun moveZeroesToEnd(arr: IntArray) {
    // assign first element
    var j = 0
    for (i in 0 until arr.size){
        if (arr[i] != 0) {
            val temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp
            j++
        }
    }
}
fun main() {
    val arr = intArrayOf(1, 0, 2, 0, 3, 4, 0, 5)
    moveZeroesToEnd(arr)
    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
    /*for (item in arr) {
        print("$item ")
    }*/
}
