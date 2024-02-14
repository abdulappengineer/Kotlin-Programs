package string

/**
 * Program to Capitalize the first character of each word in a String.
 */

/**
 * Input:  my name is abdul khalid
 * Output:  My Name Is Abdul Khalid
 */

fun main() {
    var str = "my name is abdul khalid"

    str = " $str"

    // Add space at the beginning of the old string
    // to capture the first letter of the first word.
    var result = ""

    var i = 0
    while (i < str.length) {
        var ch = str[i]

        // If white space found then concatenate it along with
        // the upper transformation of the letter next to it.
        if (ch == ' ') {
            result += ch
            i++
            ch = str[i] // at next index
            result += ch.toUpperCase()
        } else {
            // otherwise just concatenate without any transformation
            result += ch
        }
        i++
    }
    println(result.trim())
}
