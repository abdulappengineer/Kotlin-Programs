package array

/**
 * Print unique elements in ascending order
 * Input: int arr[] = { 1, 2, 3, 1, 2, 4, 5, 3 };
 * Output: 1, 2, 3, 4, 5
 *
 */

fun printUniqueItems(arr: IntArray) {
    val n = arr.size
    // var unique = true
    val set = HashSet<Int>()

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            // sort array in ascending order
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
            // check for unique elements
            /* if (arr[i] == arr[j]) {
                 unique = false
             }*/
        }

        /*if (unique) {
            print("${arr[i]}, ")
        }
        unique = true*/

        if (set.add(arr[i])) {
            print("${arr[i]}, ")
        }
    }
}

fun main() {
    //  val arr = intArrayOf(1, 2, 3, 1, 2, 4, 5, 3)
    val arr = intArrayOf(2, 4, 5, 2, 1, 3, 5, 6)
    printUniqueItems(arr)
}
