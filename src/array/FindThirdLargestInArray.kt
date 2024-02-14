package array

/**
 * https://www.geeksforgeeks.org/third-largest-element-array-distinct-elements/
 */

/**
 * Input: arr[] = {1, 14, 2, 16, 10, 20}
 * Output: The third Largest element is 14
 *
 * Explanation: Largest element is 20, second largest element is 16
 * and third largest element is 14
 */

fun findThirdLargest(arr: IntArray): Int {

    var firstLargest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    var thirdLargest = Int.MIN_VALUE

    for (item in arr) {
        if (item > firstLargest) {
            thirdLargest = secondLargest
            secondLargest = firstLargest
            firstLargest = item

        } else if (item > secondLargest && item < firstLargest) {
            thirdLargest = secondLargest
            secondLargest = item

        } else if (item > thirdLargest && item < secondLargest) {
            thirdLargest = item
        }
    }
    return thirdLargest
}

fun main() {
    val arr = intArrayOf(1, 2, 5, 6, 3, 2)
    val thirdLargest = findThirdLargest(arr)
    println("Third Largest: $thirdLargest")
}

//Second Method:
/*fun findThirdLargest(arr: IntArray): Int {

    val n = arr.size

    // sort array in ascending order
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    //return last third item
    return arr[n - 3]
}

fun main() {
    val arr = intArrayOf(1, 2, 5, 6, 3, 2)
    val thirdLargest = findThirdLargest(arr)
    println("Third Largest: $thirdLargest")
}*/
