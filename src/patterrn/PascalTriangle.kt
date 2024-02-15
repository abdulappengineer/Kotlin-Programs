package patterrn
import java.util.Scanner

/**
 * Print below pascal pattern
 *
 * Input: Enter the no.of rows: 5
 *
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 *
 */

fun main() {
    var n: Int
    val no: Int

    print("Enter the no.of rows: ")
    val `in` = Scanner(System.`in`)
    no = `in`.nextInt()

    for (i in 0 until no) {

        for (sp in 1 until (no - i)) {
            print(" ")
        }

        n = 1
        for (j in 0..i) {
            print("$n ")

            n = n * (i - j) / (j + 1)
        }
        println()
    }
}
