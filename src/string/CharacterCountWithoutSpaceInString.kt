package string

/**
 * https://www.javatpoint.com/java-program-to-count-the-total-number-of-characters-in-a-string
 */

import java.util.Scanner

fun countNumChars(str: String): Int {
    var count = 0
    val a = str.toCharArray()

    for (i in a.indices) {
        if (a[i] != ' ') {
            count++
        }
    }
    return count
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val s = scanner.nextLine()

    val result = countNumChars(s)
    println("Number of characters: $result")
}
