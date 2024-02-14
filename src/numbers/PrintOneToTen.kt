package numbers

/**
 * https://www.geeksforgeeks.org/how-will-you-print-numbers-from-1-to-200-without-using-loop/
 */

fun callMe(n: Int) {
    if (n <= 10) {
        println(n)
        callMe(n + 1)
    }
}

fun main() {
    callMe(1)
}
