package string

/**
 * https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
 */

fun sortString(str: String) {

    val arr = str.toCharArray()

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] > arr[j]) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    print("Sorted string: ")
    for (item in arr) {
        print("$item")
    }
}

fun main() {
    val str = "edcba"
    sortString(str)
}
