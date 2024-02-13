package array

/**
 * https://javaconceptoftheday.com/how-to-find-all-pairs-of-elements-in-an-array-whose-sum-is-equal-to-a-given-number/
 */

/**
 * For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
 * then you have to find all pairs of elements in this array whose sum must be 20.
 * In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
 */

fun findPairs(arr: IntArray, num: Int) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == num) {
                println("(${arr[i]}, ${arr[j]})")
            }
        }
    }
}

fun main() {
    val arr = intArrayOf(1, 5, 7, -1, 5)
    val num = 6
    findPairs(arr, num)
}

