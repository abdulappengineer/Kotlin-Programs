package array

/**
 * https://www.geeksforgeeks.org/find-duplicates-given-array-elements-not-limited-range/
 * https://www.javatpoint.com/java-program-to-print-the-duplicate-elements-of-an-array
 */

/**
 * Input: 1, 2, 3, 4, 2, 7, 8, 2, 8, 3, 2
 * Output: 2 3 8
 */

fun main() {
    /*// Initialize array
    val arr = intArrayOf(1, 2, 3, 4, 2, 7, 8, 8, 3)
    println("Duplicate elements in given array: ")

    // Searches for duplicate element
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                println(arr[j])
            }
        }
    }*/

    // Using HashMap
    val arr = intArrayOf (1, 2, 3, 4, 2, 7, 8, 2, 8, 3, 2)

    // Create a HashMap to store the frequency of each item
    val map = HashMap<Int, Int>()

    // Populate the frequencyMap
    for (item in arr) {
        if (map.containsKey(item)) {
            // If the item is already in the map, increment its frequency
            val count = map[item]!!
            map[item] = count + 1
        } else {
            // If the item is not in the map, add it with a frequency of 1
            map[item] = 1
        }
    }

    // Iterate through the HashMap and print repeated items
    for ((item, freq) in map) {
        if (freq > 1) {   // if (freq == 1) -> print unique
            //println("$item is repeated $freq times")
            println("$item")
        }
    }
}
