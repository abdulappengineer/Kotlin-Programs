package string

/**
 * Write a Program to get first letter of each word in String
 * https://www.geeksforgeeks.org/string-containing-first-letter-every-word-given-string-spaces/
 */

// Method: 1
fun splitWords(str: String) {
    val words = str.split(" ")

    for (word in words) {
        // To get the first letter of each word
        println(word.first())
        // To get the last letter of each word
        // println(word.last())
    }
}

fun main() {
    val str = "My name is Abdul"
    splitWords(str)
}

// Method: 2
/*fun firstLetterWord(str: String): String {
    var result = ""
    var v = true

    for (i in 0 until str.length) {
        // If it is a space, set v as true.
        if (str[i] == ' ') {
            v = true
        } else if (str[i] != ' ' && v) {
            // Else check if v is true or not.
            // If true, copy the character in the output string and set v as false.
            result += str[i]
            v = false
        }
    }

    return result
}

fun main() {
    val str = "My name is Abdul"
    println(firstLetterWord(str))
}*/
