package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-program-to-find-the-largest-of-three-numbers/
 */

/**
 * Input: x = 7, y = 20, z = 56
 * Output: 56
 */

fun main() {
    val a: Int
    val b: Int
    val c: Int

    val scanner = Scanner(System.`in`)
    print("Enter three numbers: ")

    a = scanner.nextInt()
    b = scanner.nextInt()
    c = scanner.nextInt()

    if (a > b && a > c) {
        println("$a is the largest number")
    } else if (b > a && b > c) {
        println("$b is the largest number")
    } else if (c > a && c > b) {
        println("$c is the largest number")
    }
    /* else {
        println("Entered numbers are not distinct.")
    } */
}
