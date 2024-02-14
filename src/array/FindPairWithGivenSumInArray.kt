package array
import java.util.HashMap

/**
 * Find Pair with given sum in an array.
 * Input  :  arr[] = {1, 5, 7, -1, 5},
 *           sum = 6
 * Output : (1, 5) (7, -1) (1, 5)
 */

fun findPairsWithSum(arr: IntArray, num: Int) {
    for (i in 0 until arr.size) {
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

    findPairsWithSum(arr, num)
}

// Using HasMap: Best Approach
/*fun findPairsWithSum(arr: IntArray, num: Int) {
    val map = HashMap<Int, Int>()

    for (i in arr.indices) {
        val complement = num - arr[i]

        if (map.containsKey(complement)) {
            println("(${arr[i]}, $complement)")
        }

        map[arr[i]] = i
    }
}

fun main() {
    val arr = intArrayOf(1, 5, 7, -1, 5)
    val num = 6

    println("Pairs with sum $num are:")
    findPairsWithSum(arr, num)
}*/

