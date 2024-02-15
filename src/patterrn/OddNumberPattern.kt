package patterrn
import java.util.Scanner

/**
 * Print below pattern
 *
 *Input: Enter the number : 5
 *
 * Output:
 *      1
 * 		3 5
 * 		7 9 11
 * 		13 15 17 19
 * 		21 23 25 27 29
 *
 */

fun main() {
    val num: Int
    var a = 1   // a = 1;

    val `in` = Scanner(System.`in`)
    print("Enter the number: ")
    num = `in`.nextInt()

    for (i in 1..num) {
        for (j in 1..i) {
            print("$a ")

            a += 2
        }
        println()
    }
}
