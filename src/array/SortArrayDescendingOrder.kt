package array

/**
 * https://www.geeksforgeeks.org/java-program-to-sort-the-array-elements-in-descending-order/
 */

fun main() {
    val arr = intArrayOf(5, 2, 8, 3, 1, 6)

    // Sort the array in descending order using a loop
    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] < arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    // Print the sorted array
    println("\nSorted Array in Descending Order: ")
    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
}