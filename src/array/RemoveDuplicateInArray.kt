package array

/**
 * https://www.geeksforgeeks.org/java-program-to-remove-duplicate-elements-from-the-array/
 */

fun main() {
    val a = intArrayOf(2, 3, 4, 4, 5, 5, 6, 7, 3, 5)

    var unique: Boolean

    println("Unique elements in array: ")

    for (i in a.indices) {
        unique = true

        for (j in i + 1 until a.size) {
            if (a[i] == a[j]) {
                unique = false
            }
        }

        if (unique) {
            print("${a[i]} ")
        }
    }
}
