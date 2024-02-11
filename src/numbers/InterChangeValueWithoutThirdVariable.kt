package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
 * https://www.javatpoint.com/program-to-swap-two-numbers-without-using-the-third-variable
 */

fun main() {
    var a: Int
    var b: Int

    val scanner = Scanner(System.`in`)
    print("Enter the first number: ")
    a = scanner.nextInt()

    print("Enter the second number: ")
    b = scanner.nextInt()

    println("Before swapping:")
    println("a= $a, b= $b")

    a = a + b
    b = a - b
    a = a - b

    /* Alternatively, you can use multiplication and division:
    a = a * b
    b = a / b
    a = a / b
    */


    println("After swapping:")
    println("a= $a, b= $b")
}
