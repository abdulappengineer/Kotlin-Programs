package array

/**
 * https://www.geeksforgeeks.org/find-the-missing-number/
 */

/**
 * Input: 5, 3, 1, 2
 * Output: 4
 */

fun missingNumber(arr: IntArray): Int {
    val n = arr.size + 1 // need to execute +1 length of array
    val numberSum = n * (n + 1) / 2
    var arraySum = 0

    for (i in arr.indices) {
        arraySum += arr[i]
    }

    val missingNumber = numberSum - arraySum
    return missingNumber
}

fun main() {
    val arr = intArrayOf(5, 3, 1, 2)
    println("Missing number from array: ${missingNumber(arr)}")
}

// Method1: Using HashMap (Best Approach)
/*fun main() {
    val arr = intArrayOf(4, 3, 6, 3, 2, 1, 1)
    val map = HashMap<Int, Boolean>()
    val n = arr.size

    for (item in arr) {
        if (map[item] == null) {
            map[item] = true
        } /*else {
            println("Repeating = $i")
        }*/
    }

    for (i in 1..n) {  // (i in 1 until n+1)
        if (map[i] == null) {
            println("Missing = $i")
        }
    }
}*/

//Method2: Using HashMap
/*fun findMissingNumber(arr: IntArray): Int {
    val set = HashSet<Int>()

    // Add all elements from arr to the HashSet
    for (num in arr) {
        set.add(num)
    }

    for (i in 1 until arr.size + 1) {
        // If the current number is not in the HashSet, it's the missing number
        if (!set.contains(i)) {
            return i
        }
    }
    // If no missing number is found, return -1 (or any other appropriate value)
    return -1
}

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 3, 4, 5, 6, 8)
    val missingNumber = findMissingNumber(arr)
    if (missingNumber != -1) {
        println("The missing number is: $missingNumber");
    } else {
        println("No missing number found.");
    }
}*/
