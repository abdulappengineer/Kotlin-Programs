package string

/**
 * https://www.geeksforgeeks.org/remove-extra-spaces-string/
 */

//Method: 1
fun removeExtraSpaces(str: String): String {
    var result = ""
    var prevChar = ' '
    for (char in str) {
        if (prevChar != ' ' || char != ' ') {
            result += char
        }
        prevChar = char
    }
    return result
}

fun main() {
    val str = " How   are   you?  "
    val result = removeExtraSpaces(str)
    println(result)
}

//Method: 2
/*fun removeExtraSpaces(input: String): String {
    var result = " "
    var isSpace = false

    for (char in input) {
        if (char != ' ') {
            result += char
            isSpace = false
        } else {
            if (!isSpace) {
                result += char
            }
            isSpace = true
        }
    }
    return result
}

fun main() {
    val str = "How     are    you?"
    val result = removeExtraSpaces(str)
    println(result)
}*/

