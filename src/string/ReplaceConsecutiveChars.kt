package string

/**
 * Write a Kotlin program that replaces repeated characters with their respective counts in a given input string:
 * Input:  Hii there how areee you?
 * Output:  Hi2 there how are3 you?
 */

fun replaceConsecutiveChars(str: String): String {
    val charArr = str.toCharArray()
    var result = ""
    var count = 1
    for (i in 0 until charArr.size - 1) {
        if (charArr[i] == charArr[i + 1]) {
            count++
        } else {
            result += charArr[i]
            if (count > 1) {
                result += count
            }
            count = 1
        }
    }
    // Add the last character
    result += charArr[charArr.size - 1]
    if (count > 1) {
        result += count
    }

    return result
}
fun main() {
    val input = "Hii there how areee you?"
    val result = replaceConsecutiveChars(input)
    println(result)
}
