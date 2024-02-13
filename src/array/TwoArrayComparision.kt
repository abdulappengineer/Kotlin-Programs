package array

/**
 * https://www.geeksforgeeks.org/java-program-to-check-if-two-arrays-are-equal-or-not/
 */

/**
 * Input  :  = 1, 2, 3, 4, 5
 *           = 1, 2, 3, 4, 5
 * Output : Yes
 */

fun areArraysEqual(arr1: IntArray, arr2: IntArray): Boolean {
    if (arr1.size != arr2.size) {
        return false
    }
    for (i in arr1.indices) {
        if (arr1[i] != arr2[i]) {
            return false
        }
    }
    return true
}

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = intArrayOf(1, 2, 3, 4, 5)
    val result = areArraysEqual(arr1, arr2)
    if (result) {
        println("Two arrays are equal");
    } else {
        println("Two arrays are not equal");
    }

}