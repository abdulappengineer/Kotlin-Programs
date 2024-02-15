package string

/**
 * Remove Leading white space from string.
 */

fun main() {
    val str = "         My name is Abdul."
    var spaceFlag = true
    val arr = str.toCharArray()

    for (i in arr.indices) {
        if (arr[i] != ' ') {
            spaceFlag = false
        }
        if (!spaceFlag) {
            print(arr[i])
        }
    }
}
