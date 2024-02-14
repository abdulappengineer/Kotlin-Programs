package array

/**
 * Find elements that appear thrice in an array.
 */

fun findElementsAppearingThrice(arr: IntArray): List<Int> {
    val map = HashMap<Int, Int>()

    // Count the frequency of each element
    for (item in arr) {
        if (map.containsKey(item)) {
            val count = map [item]!!
            map [item] = count + 1
        } else {
            map [item] = 1
        }
    }
    // Collect the elements appearing thrice
    val result = ArrayList<Int>()
    for ((item, frequency) in map) {
        if (frequency == 3) { // frequency == 1 -> print that appears once
            result.add(item)
        }
    }

    return result
}
fun main() {
    val array = intArrayOf(1, 2, 3, 1, 2, 3, 4, 5, 2, 4, 5, 4, 5)
    val elementsAppearingThrice = findElementsAppearingThrice(array)
    for (item in elementsAppearingThrice) {
        print("$item ")
        // println("$item: appears thrice. ")
    }
}
