package array

/**
 * Program to find second largest and second minimum in an array.
 */

fun findSecondMaxMin(arr: IntArray) {
    val n = arr.size
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    var smallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE

    for (i in 0 until n) {
        if (arr[i] > largest) {
            secondLargest = largest
            largest = arr[i]
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i]
        }

        if (arr[i] < smallest) {
            secondSmallest = smallest
            smallest = arr[i]
        } else if (arr[i] < secondSmallest && arr[i] != smallest) {
            secondSmallest = arr[i]
        }
    }

    println("Second largest: $secondLargest")
    println("Second smallest: $secondSmallest")
}

fun main() {
    val arr = intArrayOf(5, 8, 2, 10, 15, 4)
    findSecondMaxMin(arr)
}
