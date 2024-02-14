package array

fun swapElement(arr: IntArray, index1: Int, index2: Int) {
    val temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp
}
fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val index1 = 1
    val index2 = 3

    swapElement(arr, index1, index2)
    print("After Swapping: ")
    for (item in arr) {
        print("$item ")
    }
    //println("After Swapping: ${arr.joinToString(", ")}")
}
