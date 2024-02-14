package array

/**
 * Find duplicate elements in array using a single loop (without using nested loop)?
 */

fun findDuplicates(arr: IntArray) {  // : List<Int>
    val set = HashSet<Int>()
    // val duplicates = ArrayList<Int>()
    println("Duplicate elements in array:")
    for (item in arr) {
        if (!set.add(item)) {  // if (set.add(item)) { -> print unique
            //duplicates.add(item)
            print("$item ")
        }
    }
    // return duplicates
}
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5, 2, 4, 6)
    findDuplicates(arr)
    /* val duplicateElements = findDuplicates(arr)
     println("Duplicate elements in the array:")
     for (element in duplicateElements) {
         print("$element ")
     }*/
}
