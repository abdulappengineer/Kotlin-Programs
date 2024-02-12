package array

/**
 * https://www.geeksforgeeks.org/how-to-left-or-right-rotate-an-array-in-java/
 */

fun leftRotate(arr: IntArray, size: Int, rotation: Int): IntArray {
    for (i in 0 until rotation) {
        // take out the first element
        val firstItem = arr[0]
        for (j in 0 until size - 1) {
            // shift array elements towards left by 1 place
            arr[j] = arr[j + 1]
        }
        arr[size - 1] = firstItem
    }
    return arr
}

fun rightRotate(arr: IntArray, size: Int, rotation: Int): IntArray {
    for (i in 0 until rotation) {
        // take out the last element
        val lastItem = arr[size - 1]
        for (j in size - 1 downTo 1) {
            // shift array elements towards right by one place
            arr[j] = arr[j - 1]
        }
        arr[0] = lastItem
    }
    return arr
}
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val rotateBy = 4
    val leftArr = leftRotate(arr, arr.size, rotateBy)
    println("Left Rotated Array: ${leftArr.joinToString(", ")}")
    /* for (item in leftArr){
         print("$item ,")
     }*/
    val rightArr = rightRotate(arr, arr.size, rotateBy)
    println("Right Rotated Array: ${arr.joinToString(", ")}")
}
