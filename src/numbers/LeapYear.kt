package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-program-to-find-if-a-given-year-is-a-leap-year/
 */

/**
 * A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
 * A leap year (except a century year) can be identified if it is exactly divisible by 4.
 * A century year should be divisible by 4 and 100 both.
 * A non-century year should be divisible only by 4.
 */

fun main() {
    val year: Int

    val scanner = Scanner(System.`in`)
    print("Enter the year: ")
    year = scanner.nextInt()

    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
        println("$year is a leap year")
    } else {
        println("$year is not a leap year")
    }
}
