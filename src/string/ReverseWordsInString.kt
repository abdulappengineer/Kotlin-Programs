package string

/**
 * Reverse words in a given String in Java.
 */

/**
 * Input:  one two three four
 * Output:  four three two one
 */

fun main() {
    val str = "one two three four"
    var revStr = ""
    val arr = str.split(" ")

    for (i in arr.size - 1 downTo 0) {
        revStr += "${arr[i]} "
    }
    println(revStr.trim())
}
