package string

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/recursive-function-check-string-palindrome/
 */

/**
 * Input : malayalam
 * Output : Yes
 */

fun reverseStr(str: String): String {
    if (str.isEmpty()) {
        return str
    }
    return reverseString(str.substring(1)) + str[0]
    // return(str.dropLast(1)) + str.last()
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val s = scanner.nextLine()

    val revStr1 = reverseStr(s)

    if (s == revStr1) {
        println("$revStr1 is palindrome")
    } else {
        println("$revStr1 is not a Palindrome")
    }
}
