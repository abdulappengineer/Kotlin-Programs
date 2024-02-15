package string

/**
 * Write a program to find the longest palindrome in a string.
 * https://www.geeksforgeeks.org/longest-palindromic-substring/
 */

/**
 * Input: str = “abamadam”
 * Output: “madam”
 */

fun findLongestPalindrome(str: String): String {
    var currentPalindrome = ""
    var longestPalindrome = ""

    for (i in 1 until str.length - 1) {
        var left = i - 1
        var right = i + 1

        while (left >= 0 && right < str.length) {
            if (str[left] != str[right]) {
                break
            }

            currentPalindrome = str.substring(left, right + 1)

            if (currentPalindrome.length > longestPalindrome.length) {
                longestPalindrome = currentPalindrome
            }

            left--
            right++
        }
    }
    return longestPalindrome
}

fun main() {
    // val str = "cuoyoucffffggggffff"
    val str = "abamadam"
    println(findLongestPalindrome(str))
}
