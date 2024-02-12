package array

/**
 * https://www.w3resource.com/java-exercises/array/java-array-exercise-15.php
 */

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = intArrayOf(4, 5, 6, 7, 8)

    print("Common elements between arr1 and arr2: ")
    for (element1 in arr1) {
        for (element2 in arr2) {
            if (element1 == element2) {
                println("$element1 ")
            }
        }
    }
}
