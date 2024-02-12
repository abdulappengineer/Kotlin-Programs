package array

/**
 * https://www.digitizedpost.com/java-2d-array-find-max-number/
 */

fun main() {
    val arr = arrayOf(intArrayOf(5, 2, 9), intArrayOf(1, 5, 6))
    var min = arr[0][0]
    var max = arr[0][0]

    for (row in arr) {
        for (element in row) {
            if (element < min) {
                min = element
            }
            if (element > max) {
                max = element
            }
        }
    }

    println("The smallest element in the array is: $min")
    println("The largest element in the array is: $max")
}
