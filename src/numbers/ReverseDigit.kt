package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-reverse-number-program/
 */

/**
 * Input: 12345
 * Output: 54321
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    var num = scanner.nextInt()

    var rem: Int
    var rev = 0

    while (num != 0) {
        rem = num % 10
        rev = (rev * 10) + rem
        num /= 10
    }

    println("Reverse of digits = $rev")
}
