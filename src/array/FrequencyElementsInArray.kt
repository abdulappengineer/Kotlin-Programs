package array

/**
 * https://www.javatpoint.com/java-program-to-find-the-frequency-of-each-element-in-the-array
 */

/**
 * Input: 1, 2, 3, 2, 1, 3, 4, 5, 4
 * Output: 1 = 2 times.
 * 2 = 2 times.
 * 3 = 2 times.
 * 4 = 2 times.
 * 5 = 1 times.
 */

fun main() {
    val arr = intArrayOf(1, 2, 3, 2, 1, 3, 4, 5, 4)

    // Loop through the array and count the occurrences of each element
    for (i in arr.indices) {
        var count = 0
        var counted = false

        for (j in arr.indices) {
            if (arr[i] == arr[j]) {
                count++
                if (i > j) {
                    counted = true
                    break
                }
            }
        }

        if (!counted) {
            println("${arr[i]} = $count times.")
        }
    }
}
