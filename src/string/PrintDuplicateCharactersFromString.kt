package string

/**
 * https://www.javatpoint.com/program-to-find-the-duplicate-characters-in-a-string
 */

fun findDuplicates(str: String) {

    val arr = str.toCharArray()

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j] && arr[i] != ' ') {
                print("${arr[i]} ")
            }
        }
    }
}

fun main() {
    val str = "abdul abc"
    findDuplicates(str)
}

//Using HashMap: Best Approach
/*fun findDuplicates(str: String) {

    val arr = str.toCharArray()
    val map = HashMap<Char, Int>()

    for (i in 0 until arr.size) {
        if (map.containsKey(arr[i])) {
            val count = map[arr[i]]!!
            map[arr[i]] = count + 1
        } else {
            map[arr[i]] = 1
        }
    }

    for ((char, count) in map) {
        if (count > 1) {  // (count == 1) -> unique
            print("$char ")
        }
    }
}

fun main() {
    val str = "abdul abc"
    findDuplicates(str)
}*/
