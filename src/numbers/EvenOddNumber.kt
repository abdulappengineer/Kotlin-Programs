package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
 */

/**
 * Input : 13
 * Output: ODD
 */

/**
 * Input : 24
 * Output: EVEN
 */

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a number: ")
    val number: Int = scanner.nextInt()

    if (number % 2 == 0) {
        println("$number is even number")
    } else {
        println("$number is Odd Number")
    }
}