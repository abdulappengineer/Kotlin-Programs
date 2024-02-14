package array

/**
 * How to print duplicate elements in array without using nested loop in java?
 */

fun printDuplicateElements(arr: IntArray) {
    val set = HashSet<Int>()
    print("Duplicate elements: ")
    for (item in arr) {
        if (!set.add(item)) {  // if (set.add(item)) -> (unique)
            print("$item ")
        }
    }
}
fun main() {
    val arr = intArrayOf(1, 2, 3, 2, 4, 5, 3)
    printDuplicateElements(arr)
}
