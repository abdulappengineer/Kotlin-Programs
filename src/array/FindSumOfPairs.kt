package array

/**
 * https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/
 */

fun checkSumWithPairs(arr: IntArray, value: Int): Boolean {
    val n = arr.size
    for (i in 0 until n) {
        for (j in i + 1 until n) {

            if (arr[i] + arr[j] == value) {
                return true
            }
        }
    }
    return false
}

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 4, 5, 6)
    val value = 5
    val checkSum = checkSumWithPairs(arr, value)
    println(checkSum)
}

// Using HashMap: Best Approach
/*fun hasPairWithSum(arr: IntArray, value: Int): Boolean {
    val map = HashMap<Int, Int>()

    for (item in arr) {
        val complement = value - item
        if (map.containsKey(complement)) {
            return true // Found a pair with the target sum
        }
        map[item] = item
    }
    return false // No pair found with the target sum
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val value = 8
    val result = hasPairWithSum(arr, value)
    println(result)
}*/
