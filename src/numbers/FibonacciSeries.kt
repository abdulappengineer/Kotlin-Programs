package numbers

import java.util.*

/**
 * https://www.geeksforgeeks.org/java-fibonacci-series/
 */

/**
 * Input: N = 10
 * Output: 0 1 1 2 3 5 8 13 21 34
 * Explanation: Here first term of Fibonacci is 0 and second is 1,
 * so that 3rd term = first(o) + second(1) etc., and so on.
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    val num = scanner.nextInt()

    var i = 1
    var a = 0
    var b = 1
    var sum: Int

    println("Fibonacci Series : ")

    while (i <= num) {
        print("$a ")
        sum = a + b
        a = b
        b = sum
        i++
    }
}
