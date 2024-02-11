package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-program-to-check-if-a-given-number-is-perfect-number/
 */

/**
 * n = 9
 * Proper Divisors of 9 are 1 and 3.
 * Sum = 1+3 = 4 ≠ 9
 * ⇒ 9 is not a perfect number.
 */

/**
 * n = 6
 * Proper Divisors of 6 are 1, 2 and 3.
 * Sum = 1+2+3 = 6 = 6
 * ⇒ 6 is a perfect number
 */

fun main() {
    val num: Int
    var sum = 0

    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    num = scanner.nextInt()

    val temp: Int = num

    for (i in 1 until num) {
        if (num % i == 0) {
            sum += i
        }
    }

    if (temp == sum) {
        println("$temp is a perfect number")
    } else {
        println("$temp is not a perfect number")
    }
}
