package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-palindrome-number/
 * https://www.javatpoint.com/palindrome-program-in-java
 */

/**
 * Input : n = 121
 * Output: 121
 */

fun main() {
    var num: Int
    var rem: Int
    var rev = 0

    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    num = scanner.nextInt()
    val temp: Int = num

    while (num != 0) {
        rem = num % 10
        rev = (rev * 10) + rem
        num /= 10
    }

    if (temp == rev) {
        println("$rev is palindrome")
    } else {
        println("$rev is not palindrome")
    }
}
