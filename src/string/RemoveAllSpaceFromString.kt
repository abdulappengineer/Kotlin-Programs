package string

/**
 * https://www.geeksforgeeks.org/how-to-remove-all-white-spaces-from-a-string-in-java/
 */

/**
 * Input:  str = "    A  Computer  Science   Portal   "
 * Output: AComputerSciencePortal
 */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val str = scanner.nextLine()

    val a = str.toCharArray()

    for (i in a.indices) {
        if (a[i] != ' ') {
            print(a[i])
        }
    }
}
