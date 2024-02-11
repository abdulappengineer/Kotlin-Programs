package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/sum-of-all-the-prime-numbers-in-a-given-range/
 */

/**
 * Input : l=1 and r=6
 * Output : 10
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter first number: ")
    val num1 = scanner.nextInt()

    print("Enter second number: ")
    val num2 = scanner.nextInt()

    var sum = 0

    for (i in num1..num2) {
        var j = 2

        while (j < i) {
            if (i % j == 0) {
                break
            }
            j++
        }

        if (i == j) {
            // print prime number
            print("$i ")

            // sum of prime number
            sum += i
        }
    }

    // print sum of prime numbers
    println()
    println("Sum of prime numbers = $sum")
}
