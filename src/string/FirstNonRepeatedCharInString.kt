package string

/**
 * How to program to print first non-repeated character from String
 * https://www.geeksforgeeks.org/given-a-string-find-its-first-non-repeating-character/
 */

/**
 * Input: Enter the string: hello
 * Output: First non-repeated character in the string: h
 */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val str = scanner.nextLine()

    val a = str.toCharArray()

    var unique = true

    for (i in a.indices) {
        for (j in i + 1 until a.size) {
            if (a[i] == a[j]) {
                unique = false
            }
        }
        if (unique) {
            println("First non-repeated character in the string: ${a[i]}")
            break
        }
    }
}
