package string

/**
 * Reverse words in a given String in Java.
 */

/**
 * Input:  My Name Is Abdul Khalid
 * Output:  Khalid Abdul Is Name My
 */

fun main() {
    val str = "My Name Is Abdul Khalid"
    var revStr = ""
    val arr = str.split(" ")

    for (i in arr.size - 1 downTo 0) {
        revStr += "${arr[i]} "
    }
    println(revStr.trim())
}
