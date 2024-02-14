package array

/**
 * https://www.geeksforgeeks.org/next-greater-element/
 */

/**
 * The Next greater Element for an element x is the first greater element on the right side of x in the array.
 * Elements for which no greater element exist, consider the next greater element as -1.
 */

/**
 * Input: arr[] = [ 4 , 5 , 2 , 25 ]
 * Output:  4      –>   5
 *                5      –>   25
 *                2      –>   25
 *               25     –>   -1
 * Explanation: except 25 every element has an element greater than them present on the right side
 */

fun printNextGreaterElement(arr: IntArray, n: Int) {
    var next: Int
    for (i in 0 until n) {
        next = -1
        for (j in i + 1 until n) {
            if (arr[i] < arr[j]) {
                next = arr[j]
                break
            }
        }
        println("${arr[i]} -> $next")
    }
}

fun main() {
    val arr = intArrayOf(13, 7, 6, 12)
    val n = arr.size
    printNextGreaterElement(arr, n)
}
