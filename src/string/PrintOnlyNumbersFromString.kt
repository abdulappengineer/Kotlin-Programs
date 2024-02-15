package string

import java.util.Scanner

/**
 * Extract all integers from the given string in Java
 * https://www.geeksforgeeks.org/extract-all-integers-from-the-given-string-in-java/
 */

/**
 * Input: Enter the string: abdul123khalid
 * Output: 1 ,2 ,3 ,
 */

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val str = scanner.nextLine()

    val a = str.toCharArray()

    for (i in a.indices) {
        for (j in 48..57) { //This range( from 48 to 57) corresponds to the ASCII values of the digits '0' to '9'.
            if (a[i] == j.toChar()) {
                print("${a[i]} ,")
            }
        }
    }
}

// Method: 2
/*
fun main() {
    val str: String
    var ch: Char
    val scanner = Scanner(System.`in`)

    print("Enter the String: ")
    str = scanner.nextLine()

    println("\nNumbers available in the String are:")
    for (i in 0 until str.length) {
        ch = str[i]
        if (Character.isDigit(ch)) {
            print(ch)
        }
    }
}*/
