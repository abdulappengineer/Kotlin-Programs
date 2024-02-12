package array

/**
 * https://www.geeksforgeeks.org/reverse-an-array-in-java/
 */

/**
 * Input :  1, 2, 3, 4, 5
 * Output : 5, 4, 3, 2, 1
 */

fun main() {
    val a = intArrayOf(1, 2, 3, 4, 5)
    println("Reverse array is: ")

    for (i in a.size - 1 downTo 0) {
        print("${a[i]} ")
    }
}
