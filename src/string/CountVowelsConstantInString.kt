package string

import java.util.Scanner

/**
 * https://www.javatpoint.com/java-program-to-count-the-total-number-of-vowels-and-consonants-in-a-string
 */

//Method: 1
fun main() {
    // Counter variable to store the count of vowels and consonants
    var vCount = 0
    var cCount = 0

    // Declare a string
    var str = "This is a really simple sentence"

    // Converting the entire string to lower case to reduce the comparisons
    str = str.toLowerCase()

    for (i in 0 until str.length) {
        // Checks whether a character is a vowel
        when (str[i]) {
            'a', 'e', 'i', 'o', 'u' -> vCount++ // Increments the vowel counter
            in 'a'..'z' -> cCount++ // Increments the consonant counter
        }
    }

    println("Number of vowels: $vCount")
    println("Number of consonants: $cCount")
}


// Method: 2
/*fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the string: ")
    val str = scanner.nextLine()

    var vCount = 0
    var cCount = 0

    for (i in 0 until str.length) {
        val ch = str[i]

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' ||
            ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'
        ) {
            vCount++
        } else {
            cCount++
        }
    }

    println("Vowels=$vCount , Consonants=$cCount")
}*/
