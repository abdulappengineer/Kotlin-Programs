package array

/**
 * https://javaconceptoftheday.com/how-to-find-continuous-sub-array-whose-sum-is-equal-to-given-number/
 */

/**
 * Input: {12, 0, 7, 0, 8, 0, 3}
 * Number: 26
 * Output: Continuous subarray: 5 11 25
 */

fun findSubArray(arr: IntArray, number: Int) {
    var sum = arr[0]
    var start = 0

    for (i in 1 until arr.size) {
        sum += arr[i]

        while (sum > number && start <= i - 1) {
            sum -= arr[start]
            start++
        }

        if (sum == number) {
            print("Continuous subarray: ")
            for (j in start..i) {
                print("${arr[j]} ")
            }
            println()
        }
    }
}

fun main() {
    val arr1 = intArrayOf(12, 0, 7, 0, 8, 0, 3)
    findSubArray(arr1, 26)

    findSubArray(intArrayOf(15, 51, 7, 81, 5, 11, 25), 41)
}