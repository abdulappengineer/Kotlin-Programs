package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/program-to-calculate-product-of-digits-of-a-number/
 */

/**
 * Input: n = 4513
 * Output: 60
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    var num = scanner.nextInt()

    var rem: Int
    var product = 1

    while (num != 0) {
        rem = num % 10
        product *= rem
        num /= 10
    }

    println("Product of digits = $product")
}
