package string

/**
 * https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
 */

/**
 * Input: str1 = “listen”  str2 = “silent”
 * Output: “Anagram”
 * Explanation: All characters of “listen” and “silent” are the same.
 *
 * Input: str1 = “gram”  str2 = “arm”
 * Output: “Not Anagram”
 */

fun areAnagrams(s1: String, s2: String): Boolean {
    // Remove spaces and convert to lowercase for case-insensitive comparison
    val str1 = s1.replace(" ", ""). toLowerCase()
    val str2 = s2.replace(" ", ""). toLowerCase()

    // Check if the lengths of the two cleaned strings are equal
    if (str1.length != str2.length) {
        return false
    }

    // Create a HashMap to store character frequencies
    val map = HashMap<Char, Int>()

    // Count the characters in the first string and update the HashMap
    for (char in str1) {
        if (map.containsKey(char)) {
            val count = map[char]!!
            map[char] = count + 1
        } else {
            map[char] = 1
        }
    }

    // Decrement the character frequencies for the second string
    for (char in str2) {
        if (map.containsKey(char)) {
            val count = map[char]!!
            if (count == 1) {
                map.remove(char)
            } else {
                map[char] = count - 1
            }
        } else {
            return false  // If a character is not present in the HashMap, it's not an anagram.
        }
    }

    // If the HashMap is empty, it means all characters are matched and canceled out
    //return map.isEmpty()
    return true
}

fun main() {
    val str1 = "listen"
    val str2 = "silent"

    if (areAnagrams(str1, str2)) {
        println("Given strings are anagrams")
    } else {
        println("Given strings are not anagrams")
    }
}
