package string

/**
 * https://www.geeksforgeeks.org/remove-duplicates-from-a-given-string/
 */

fun main() {
    val str = "xyzxyz"
    val arr = str.toCharArray()
    var unique = true

    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                unique = false
            }
        }
        if (unique) {
            print(arr[i])
        }
        unique = true
    }
}

/*fun removeDuplicates(str: String): String {

    val arr = str.toCharArray()
    var result = ""
    var unique = true

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                unique = false
            }
        }
        if (unique) {
            result += arr[i]

            *//*[ Program to print first non-repeated character from String
              println(“First non-repeated character in the string :  ${a[i]}”)
              break ]*//*

        }
        unique = true
    }
    return result
}

fun main() {
    val str = "xyzxyz"
    val result = removeDuplicates(str)
    println(result)
}*/
