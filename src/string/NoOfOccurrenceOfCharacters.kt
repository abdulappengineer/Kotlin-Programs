package string

/**
 * https://www.geeksforgeeks.org/java-program-count-occurrences-character/
 */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val str = scanner.nextLine()

    val a = str.toCharArray()

    for (i in 'a'..'z') {
        var freq = 0

        for (j in a.indices) {
            if (i == a[j] || (i - 32) == a[j]) {  // check frequency
                freq++
            }
        }

        if (freq > 0) {
            println("$i: $freq")
        }
    }
}
