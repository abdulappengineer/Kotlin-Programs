package array

/**
 * https://www.w3resource.com/java-exercises/array/java-array-exercise-35.php
 */

fun main() {
    val arr = intArrayOf(2, 4, 6, 8, 10)
    val target = 14 // the sum we want to find

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == target) {
                println("The sum of ${arr[i]} and ${arr[j]} is $target")
                return // exit the program after finding the first pair that adds up to the target
            }
        }
    }
    println("No pair of elements in the array adds up to $target")
}
