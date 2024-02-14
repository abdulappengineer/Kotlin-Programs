package array

/**
 * https://www.geeksforgeeks.org/split-array-two-equal-sum-subarrays/
 */

/**
 * Input:   { 1 , 2 , 3 , 4 , 5 , 5  }
 * Output:  { 1 2 3 4 }
 *           { 5 , 5 }
 */

fun findSplitPoint(arr: IntArray): Int {
    var leftSum = 0
    var rightSum = 0

    for (i in 0 until arr.size) {
        leftSum += arr[i]
    }

    for (i in arr.size - 1 downTo 0) {
        // add current element to the right
        rightSum += arr[i]
        // exclude current element from left
        leftSum -= arr[i]
        if (leftSum == rightSum) {
            return i
        }
    }
    return -1  // No index found
}


fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5, 5)
    val splitPoint = findSplitPoint(arr)

    if (splitPoint == -1 || splitPoint == arr.size) {
        println("Not Possible")
        return
    }

    for (i in 0 until arr.size) {
        if (splitPoint == i) {
            println()
        }
        print("${arr[i]} ")
    }
}

