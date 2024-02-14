package array

/**
 * https://www.geeksforgeeks.org/java-program-to-remove-duplicate-elements-from-the-array/
 */

fun printUniqueElements(arr: IntArray) {
    val n = arr.size
    //var unique = true
    val set = HashSet<Int>()

    println("Unique elements in array: ")
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            // check for unique elements
            /*if (arr[i] == arr[j]) {
                unique = false
            }*/
        }
        /*if (unique) {
            print("${arr[i]} ")
        }
        unique = true*/

        if (set.add(arr[i])) {
            print("${arr[i]} ")
        }
    }
}

fun main() {
    //  val arr = intArrayOf(2, 3, 4, 4, 5, 5, 6, 7, 3, 5)
    val arr = intArrayOf(1, 2, 3, 2, 4, 1, 5, 6, 3)
    printUniqueElements(arr)
}

// Second Method:
/*fun main() {
    val arr = intArrayOf(1, 2, 3, 2, 4, 1, 5, 6, 3)

    val map = HashMap<Int, Int>()

    for (i in 0 until arr.size) {

        if (map.containsKey(arr[i])) {
            val count = map[arr[i]]!!
            map[arr[i]] = count + 1
        } else {
            map[arr[i]] = 1
        }
    }

    for ((item, count) in map) {
        if (count == 1) {  //count > 1 (duplicate will be print)
            println("$item")
        }
    }
}*/
