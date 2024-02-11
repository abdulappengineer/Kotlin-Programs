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

fun main() {
    val num: Int
    var fact = 1

    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    num = scanner.nextInt()

    for (i in 1..num) {
        fact *= i
    }

    println("Factorial = $fact")
}
