package string

/**
 * https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/
 */

/**
 * Input : str = “abba”
 *
 * Output: Yes
 */

import java.util.Scanner

fun main() {
    val str: String
    var revStr = ""
    val scanner = Scanner(System.`in`)

    println("Enter the string:")
    str = scanner.nextLine()

    val a = str.toCharArray()

    for (i in a.size - 1 downTo 0) {
        revStr += a[i]
    }

    if (str == revStr) {
        println("Palindrome")
    } else {
        println("Not palindrome")
    }
}
