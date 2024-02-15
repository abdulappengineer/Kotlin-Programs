package string

/**
 * https://www.geeksforgeeks.org/reverse-a-string-in-java/
 */

// Method: 1
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

// Method: 2
/*fun reverseString(str: String): String {
    val arr = str.toCharArray()
    val n = arr.size
    for (i in 0 until n / 2) {
        val temp = arr[i]
        arr[i] = arr[n - 1 - i]
        arr[n - 1 - i] = temp
    }
    return String(arr)
}

fun main() {
    val input = "Hello World"
    val reversed = reverseString(input)
    println(reversed) // Output: "dlrow olleh"
}*/

