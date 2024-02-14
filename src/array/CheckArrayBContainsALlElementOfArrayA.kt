package array

/**
 *   int a[] = {'m', 'a', 'g', 'i', 'c'};
 *   int b[] has random characters as below:
 *   int b[] = { 'b', 'a', 'e', 'h', 'c', 'f', 'j', 'd', 'i', 'g', 'm', 'p','k' };
 *   How to check  b[] has all the elements in a[] ?
 */

fun containsAllElements(a: CharArray, b: CharArray): Boolean {
    for (itemA in a) {
        var found = false
        for (itemB in b) {
            if (itemA == itemB) {
                found = true
                break
            }
        }
        if (!found) {
            return false
        }
    }
    return true
}
fun main() {
    val a = charArrayOf('m', 'a', 'g', 'i', 'c')
    val b = charArrayOf('b', 'a', 'e', 'h', 'c', 'f', 'j', 'd', 'i', 'g', 'm', 'p', 'k')
    val containsAllElements = containsAllElements(a, b)
    if (containsAllElements) {
        println("b[] contains all the elements in a[]")
    } else {
        println("b[] does not contain all the elements in a[]")
    }
}
