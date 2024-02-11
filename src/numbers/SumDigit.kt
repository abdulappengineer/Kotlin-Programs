package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-program-for-sum-the-digits-of-a-given-number/
 */

/**
 * Input : n = 687
 * Output : 21
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    var num = scanner.nextInt()

    var rem: Int
    var sum = 0

    while (num != 0) {
        rem = num % 10
        sum += rem
        num /= 10
    }

    println("Sum of digits = $sum")
}
