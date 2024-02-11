package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-program-for-factorial-of-a-number/
 */

/**
 * 6! == 6*5*4*3*2*1 = 720.
 * 5! == 5*4*3*2*1 = 120
 * 4! == 4*3*2*1 = 24
 */

fun fact(num: Int): Int {
    return if (num == 1) {
        1
    } else {
        // Recursion function calling itself
        num * fact(num - 1)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    val n = scanner.nextInt()

    val result = fact(n)
    println("Factorial = $result")
}
