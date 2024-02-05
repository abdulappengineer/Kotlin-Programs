package numbers

import java.util.*

/**
 * https://www.geeksforgeeks.org/program-decimal-binary-conversion/?ref=lbp
 * https://www.youtube.com/watch?v=mhnPSizp1hc
 */

/**
 *Input : 7
 * Output : 111
 */

/**
 * Input : 10
 * Output : 1010
 */

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the decimal number: ")
    var decimalNumber = scanner.nextInt()
    var binaryNumber = 0
    var placeValue = 1 //10^0 = 1

    while (decimalNumber > 0) {
        // Extract last digit
        val rem = decimalNumber % 2
        // Remove last digit
        decimalNumber /= 2
        binaryNumber += rem * placeValue
        placeValue *= 10 // placeValue incremented by *10
    }
    println("Binary number = $binaryNumber")
}