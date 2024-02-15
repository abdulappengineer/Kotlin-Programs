package patterrn

/**
 * Print below pattern
 *
 * 1 2 3 4
 * 	5 6 7 8
 * 	9 10 11 12
 *
 */

fun main() {
    var n = 1  // n = 0
    for (i in 1..3) {
        for (j in 1..4) {
            // n++
            print("$n ")
            n++
        }
        println()
    }
}
