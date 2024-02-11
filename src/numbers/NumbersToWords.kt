package numbers

/**
 * https://www.geeksforgeeks.org/convert-number-to-words/
 */

/**
 * Input: N = 438237764
 * Output: Four Hundred Thirty Eight Million Two Hundred Thirty Seven Thousand Seven Hundred Sixty Four
 */

fun main() {
    val arr = intArrayOf(2, 7, 0, 1, 7, 6)

    for (element in arr) {
        when (element) {
            0 -> print("ZERO ")
            1 -> print("ONE ")
            2 -> print("TWO ")
            3 -> print("THREE ")
            4 -> print("FOUR ")
            5 -> print("FIVE ")
            6 -> print("SIX ")
            7 -> print("SEVEN ")
            8 -> print("EIGHT ")
            9 -> print("NINE ")
            else -> Unit
        }
    }
}
