package array

/**
 * Write a program to left rotate array by one position?
 * https://www.youtube.com/watch?v=AokSEuvq0pg
 */

/**
 * Input : A[]={10, 20, 30, 40, 50}
 * Output : A[]={20, 30, 40, 50, 10}
 */

fun main() {
    val arr = intArrayOf(10, 20, 30, 40, 50)

    // store the first element in the temp variable temp = 10
    val temp = arr[0]

    // shift one element to the left
    for (i in 1 until arr.size) {
        arr[i - 1] = arr[i]
    }

    // store the temp position in the last position
    arr[arr.size - 1] = temp

    for (i in arr) {
        println(i)
    }
}