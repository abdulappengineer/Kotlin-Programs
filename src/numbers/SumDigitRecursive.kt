package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-program-for-sum-the-digits-of-a-given-number/
 */

/**
 * Input : n = 687
 * Output : 21
 */

fun sumDigit(num: Int): Int {
    var n = num
    var rem: Int
    var sum = 0

    while (n != 0) {
        rem = n % 10
        sum += rem
        n /= 10
    }

    return sum
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    val n = scanner.nextInt()

    val result = sumDigit(n)
    println("Sum of digits = $result")
}
