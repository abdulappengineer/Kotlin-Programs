package string
import java.util.Scanner

/**
 * Find the Java String length?
 */

/**
 * Input: Enter the string: My name is Abdul
 * Output: String length: 13
 */

fun stringLength(str: String): Int {
    val a = str.toCharArray()
    var len = 0
    for (i in a.indices) {
        if (a[i] != ' ') {
            len++
        }
    }
    return len
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val s = scanner.nextLine()

    val result = stringLength(s)
    println("String length: $result")
}
