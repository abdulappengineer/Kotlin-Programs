package string
import java.util.Scanner

/**
 * Enter the string: abdul khalid
 * Enter the character you want to find: a
 * Number of duplicate characters: 2
 * Duplicate Character: a
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val str = scanner.nextLine()

    print("Enter the character you want to find: ")
    val ch = scanner.nextLine()
    val c = ch.toCharArray()

    var count = 0

    for (i in 0 until str.length - 1) {
        for (j in 0 until c.size) {
            if (str[i] == c[j]) {
                // println("Indexes where duplicate characters are: $i")
                count++
            }
        }
    }

    println("Number of duplicate characters: $count\nDuplicate Character: $ch")
}