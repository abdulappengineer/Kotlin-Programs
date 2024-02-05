package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/program-binary-decimal-conversion/
 */

/**
 * Input : 111 = 1*2^2 + 1*2^1 + 1*2^0 = 4+ 2+ 1 = 7
 * Output : 7
 */

/**
 * Input : 1010 = 1 * 2^3 + 0 * 2^2 + 1 * 2^1 + 0 * 2^0 = = 8 + 0 + 2 + 0 = = 10
 * Output : 10
 */

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the binary number: ")
    // var temp = scanner.nextInt()
    var binaryNumber = scanner.nextInt()
    var decimalNumber = 0
    var base = 1

    while (binaryNumber > 0) {
        // Extract last digit
        val lastDigit = binaryNumber % 10
        // Remove last digit
        binaryNumber /= 10

        decimalNumber += lastDigit * base
        base *= 2
    }

    println("Decimal number = $decimalNumber")
}