package array

/**
 * Return index numbers when sum of two elements in array equals to the given value in kotlin
 *
 * Input = [0,2,11,4]
 * Target = 13
 *
 * Output = [1,2]
 *
 */

fun findIndicesWithSum(arr: IntArray, value: Int): Pair<Int, Int>? {
    val map = HashMap<Int, Int>()
    for (i in 0 until arr.size) {
        val complement = value - arr[i]
        if (map.containsKey(complement)){
            //return value as a key indices as a value.
            return Pair(map[complement]!!, i)
        }
        // store indices to the map (value-> key, indices->value)
        map[arr[i]] = i
    }
    return null
}

fun main() {
    val arr = intArrayOf(0, 2, 11, 4)
    val target = 13
    val indices = findIndicesWithSum(arr, target)
    println(indices) // prints "(1, 2)"
}


