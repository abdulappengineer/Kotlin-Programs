package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/find-sum-of-factorials-till-n-factorial-1-2-3-n/
 */

/**
 * Input: N = 5
 * Output: 153
 * Explanation: 1! + 2! + 3! + 4! + 5! = 1 + 2 + 6 + 24 + 120 = 153.
 */

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter number: ")
    val num = sc.nextInt()

    var total = 0

    var i = 1
    // calculate factorial
    while (i <= num) {
        var fact = 1
        var j = 1
        while (j <= i) {
            fact *= j
            j++
            // j = j + 1
        }

        // calculate sum of factorial of the number
        total += fact
        i++
        // i = i + 1
    }

    // print the factorial sum
    println("Sum: $total")
}
