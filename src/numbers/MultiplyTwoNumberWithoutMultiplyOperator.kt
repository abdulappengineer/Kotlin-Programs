package numbers

import java.util.Scanner

/**
 * https://www.javatpoint.com/multiply-two-numbers-without-using-arithmetic-operator-in-java
 */

fun main() {
    val a: Int
    val b: Int
    var c = 0

    val scanner = Scanner(System.`in`)
    print("Enter the first number: ")
    a = scanner.nextInt()

    print("Enter the second number: ")
    b = scanner.nextInt()

    for (i in 1..b) {
        c += a
    }

    println("Product of two numbers = $c")
}
