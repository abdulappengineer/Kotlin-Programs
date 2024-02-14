package string

import java.util.*

/**
 * https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 */

/**
 * Input: exp = “[()]{}{[()()]()}”
 * Output: Balanced
 * Explanation: all the brackets are well-formed
 *
 * Input: exp = “[(])”
 * Output: Not Balanced
 *
 * Explanation: 1 and 4 brackets are not balanced because
 * there is a closing ‘]’ before the closing ‘(‘
 *
 */

// Method: 1
fun isBalanced(expression: String): Boolean {
    val stack = Stack<Char>()

    for (ch in expression) {
        when (ch) {
            '(', '{', '[' -> {
                // Push (insert) opening brackets onto the top of stack
                stack.push(ch)
            }

            ')', '}', ']' -> {
                // If a closing bracket is encountered, check if the stack is empty
                if (stack.isEmpty()) {
                    return false
                }

                // Pop (removes) the top element from the stack and check if it matches the current closing bracket
                val top = stack.pop()
                if (!isMatchingPair(top, ch)) {
                    return false
                }
            }
        }
    }

    // After processing the entire expression, the stack should be empty if it's balanced
    return stack.isEmpty()
}

fun isMatchingPair(ch1: Char, ch2: Char): Boolean {
    return (ch1 == '(' && ch2 == ')') ||
            (ch1 == '{' && ch2 == '}') ||
            (ch1 == '[' && ch2 == ']')
}

fun main() {
    val expression = "{[()]}"

    if (isBalanced(expression)) {
        println("$expression is balanced.")
    } else {
        println("$expression is not balanced.")
    }
}

// Method: 2
/*fun isBalanced(expression: String): Boolean {
    val stack = Stack<Char>()

    for (char in expression) {
        when (char) {
            '(', '[', '{' -> stack.push(char)

            ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
            ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
            '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
        }
    }

    return stack.isEmpty()
}

fun main() {
    val expression = "[()]{}{[()()]()}"
    if (isBalanced(expression)) {
        println("Balanced")
    } else {
        println("Not Balanced")
    }
}*/
