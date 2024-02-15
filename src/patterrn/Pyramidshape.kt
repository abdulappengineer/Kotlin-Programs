package patterrn

/**
 * Print below pyramid pattern
 *
 *      1
 *    1 2 1
 *   1 2 3 2 1
 *  1 2 3 4 3 2 1
 * 1 2 3 4 5 4 3 2 1
 *
 */

fun main() {
    val num = 5

    for (i in 1..num) {
        // print spaces
        for (sp in 1..num - i) {
            print(" ")
        }

        // print left part
        for (j in 1..i) {
            print("$j ")
        }

        // print right part
        for (k in i - 1 downTo 1) {
            print("$k ")
        }

        println()
    }
}
