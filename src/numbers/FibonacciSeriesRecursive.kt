package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-fibonacci-series/
 */

/**
 * Input: N = 10
 * Output: 0 1 1 2 3 5 8 13 21 34
 * Explanation: Here first term of Fibonacci is 0 and second is 1,
 * so that 3rd term = first(o) + second(1) etc., and so on.
 */

fun fib(num: Int): Int {
    return when {
        num <= 0 -> 0
        num == 1 -> 1
        else -> fib(num - 1) + fib(num - 2)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    val n = scanner.nextInt()

    for (i in 0..<n) {
        val result = fib(i)
        print("$result ")
    }
}
