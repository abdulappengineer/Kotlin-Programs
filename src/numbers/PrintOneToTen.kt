package numbers

/**
 * https://www.geeksforgeeks.org/how-will-you-print-numbers-from-1-to-200-without-using-loop/
 */

fun recursiveMe(n: Int) {
    if (n <= 10) {
        println(n)
        recursiveMe(n + 1)
    }
}

fun main() {
    recursiveMe(1)
}
