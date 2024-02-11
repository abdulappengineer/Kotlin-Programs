package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/
 */

/**
 * Given a number n, write an efficient function to print all prime factors of n.
 * For example, if the input number is 12, then the output should be “2 2 3”.
 * And if the input number is 315, then the output should be “3 3 5 7”.
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    var num = scanner.nextInt()

    println("Prime factors of $num are:")
    var i = 2
    while (num > 1) {
        if (num % i == 0) {
            print("$i ")
            num /= i
        } else {
            i++
        }
    }
}
