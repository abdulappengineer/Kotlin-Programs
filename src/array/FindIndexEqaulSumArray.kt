package array

/**
 * https://www.techiedelight.com/find-index-that-divides-array-non-empty-subarrays-equal-sum/
 * https://www.geeksforgeeks.org/find-an-element-which-divides-the-array-in-two-subarrays-with-equal-product/
 */

/**
 * Input: {-7, 1, 5, 2, -4, 3, 0}
 * Output: 3
 * 3 is an equilibrium index, because: A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 */

fun findIndex(arr: IntArray): Int {
    var totalSum = 0
    var leftSum = 0
    var rightSum = 0

    for (i in 0 until arr.size) {
        totalSum += arr[i]
    }

    for (i in 0 until arr.size) {
        rightSum = totalSum - (leftSum + arr[i])

        if (leftSum == rightSum) {
            return i
        }
        leftSum += arr[i]
    }
    return -1  // No index found
}

fun main(args: Array<String>) {
    val arr = intArrayOf(-7, 1, 5, 2, -4, 3, 0 )
    val index = findIndex(arr)
    if (index == -1) {
        println("Index not found")
    } else {
        println("Index found at: $index")
    }
}
