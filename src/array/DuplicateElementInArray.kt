package array

/**
 * https://www.geeksforgeeks.org/find-duplicates-given-array-elements-not-limited-range/
 * https://www.javatpoint.com/java-program-to-print-the-duplicate-elements-of-an-array
 */

/**
 * Input: {1, 2, 3, 4, 2, 7, 8, 2, 8, 3, 2}
 * Output: 2 3 8
 */

fun main() {
    /*fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9)

        println("Duplicate elements in array: ")
        for (i in 0 until arr.size) { //for (i in arr.indices)
            for (j in i + 1 until arr.size) {
                if (arr[i] == arr[j]) {
                    println("${arr[i]}")
                }
            }
        }
    }*/
    
    fun findSplitPoint(arr: IntArray): Int {
        var leftSum = 0
        var rightSum = 0

        for (i in 0 until arr.size) {
            leftSum += arr[i]
        }

        for (i in arr.size - 1 downTo 0) {
            // add current element to the right
            rightSum += arr[i]
            // exclude current element from left
            leftSum -= arr[i]
            if (leftSum == rightSum) {
                return i
            }
        }
        return -1  // No index found
    }


    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 5, 5)
        val splitPoint = findSplitPoint(arr)

        if (splitPoint == -1 || splitPoint == arr.size) {
            println("Not Possible")
            return
        }

        for (i in 0 until arr.size) {
            if (splitPoint == i) {
                println()
            }
            print("${arr[i]} ")
        }
    }



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
