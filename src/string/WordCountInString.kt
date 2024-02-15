package string

/**
 * https://www.geeksforgeeks.org/count-words-in-a-given-string/
 */

fun main() {
    val str = "my name is abdul"
    val a = str.toCharArray()
    var count = 1

    for (i in a.indices) {
        if (a[i] == ' ') {
            count++
        }
    }

    println("Number of words in the string: $count")
}
