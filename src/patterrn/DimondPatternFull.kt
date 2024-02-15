package patterrn

/**
 * Diamond Shape Pattern Program
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *
 */

fun main() {
    val n = 5

    // left diamond
    for (i in 1..n) {
        for (sp in n - i downTo 1) {
            print(" ")
        }

        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }

    // right diamond
    for (i in n - 1 downTo 1) {
        for (sp in n - i downTo 1) {
            print(" ")
        }

        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}
