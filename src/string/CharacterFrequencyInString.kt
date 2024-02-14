package string

/**
 * Write a program to count the occurrence of each character in a string.
 * https://www.geeksforgeeks.org/java-program-to-count-the-occurrence-of-each-character-in-a-string-using-hashmap/
 */

fun countCharFreq(str: String): Map<Char, Int> {
    val map = HashMap<Char, Int>()
    for (char in str) {
        if (char != ' ') {
            if (map.containsKey(char)) {
                val count = map[char]!!
                map[char] = count + 1
            } else {
                map[char] = 1
            }
        }
    }
    return map
}
fun main() {
    val input = "Hello World"
    val freqMap = countCharFreq(input)
    for ((char, count) in freqMap) {
        println("$char: $count")
    }
}
