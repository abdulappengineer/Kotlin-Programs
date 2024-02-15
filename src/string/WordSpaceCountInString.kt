package string

/**
 * Program to Count Number of Words in String
 */

import java.util.Scanner

fun wordSpaceCount(str: String): Pair<Int, Int> {
    var count = 1
    val a = str.toCharArray()

    for (i in a.indices) {
        if (a[i] == ' ') {
            count++
        }
    }
    return Pair(count, count - 1)
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val s = scanner.nextLine()

    val (wordCount, spaceCount) = wordSpaceCount(s)

    println("Number of words: $wordCount")
    println("Number of spaces: $spaceCount")
}
