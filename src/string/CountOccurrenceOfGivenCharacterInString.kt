package string

/**
 * https://www.geeksforgeeks.org/program-count-occurrence-given-character-
 */

/**
 * Input : S = “geeksforgeeks” and c = ‘e’
 * Output : 4
 * Explanation: ‘e’ appears four times in str.
 */

fun countCharacters(str: String, ch: Char): Int {
    var res = 0

    for (i in 0 until str.length) {
        // checking character in string
        if (str[i] == ch) {
            res++
        }
    }
    return res
}

fun main() {
    val str = "geeksforgeeks"
    val ch = 'e'
    val count = countCharacters(str, ch)
    println(count)
}
