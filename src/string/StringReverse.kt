package string

/**
 * https://www.geeksforgeeks.org/reverse-a-string-in-java/
 */

fun reverseString(str: String): String {
    var revStr = ""
    for (i in str.length - 1 downTo 0) {
        revStr += str[i]
    }
    return revStr
}
fun main() {
    val str = "dcba"
    val revStr = reverseString(str)
    println("Reverse String is: $revStr")
}
