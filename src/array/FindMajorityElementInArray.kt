package array

/**
 * Java Program to find majority element in an array?
 *  A majority element in an array A[] of size n is an element that appears more than n/2 times
 */

/**
 * Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
 * Output : 4
 * Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size.
 */

import java.util.HashMap

fun findMajority(arr: IntArray) {
    val map = HashMap<Int, Int>()

    for (element in arr) {
        if (map.containsKey(element)) {
            val count = map[element] ?: 0
            map[element] = count + 1
        } else {
            map[element] = 1
        }

        if (map[element]!! > arr.size / 2) {
            println("Majority found: $element")
            return
        }
    }

    println("No Majority element")
}

fun main() {
    val a = intArrayOf(2, 2, 2, 2, 5, 5, 2, 3, 3)
    findMajority(a)
}
