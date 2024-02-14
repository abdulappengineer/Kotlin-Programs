package array

/**
 * https://www.javatpoint.com/java-program-to-sort-the-elements-of-an-array-in-ascending-order
 * https://www.geeksforgeeks.org/java-program-to-sort-the-elements-of-an-array-in-ascending-order/
 */

fun sortArrayAsc(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
}

fun main() {
    val arr = intArrayOf(1, 5, 2, 4, 3)
    sortArrayAsc(arr)
    println("Sorted array in ascending order:")
    for (element in arr) {
        print("$element ")
    }
}


/*fun main() {
    val arr = intArrayOf(5, 2, 8, 3, 1, 6)

    // Sort the array in ascending order using a loop
    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    // Print the sorted array
    println("\nSorted Array in Ascending Order: ")
    for (i in 0 until arr.size) {
        print("${arr[i]} ")
    }
}*/
