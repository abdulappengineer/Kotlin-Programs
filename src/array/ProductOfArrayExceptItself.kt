package array

/**
 * https://www.geeksforgeeks.org/a-product-array-puzzle/
 */

/**
 * Input: numbs = [1,2,3,4,5]
 * Output: [120,60,40,30]
 */

/**
 * Input: arr[]  = {10, 3, 5, 6, 2}
 * Output: prod[]  = {180, 600, 360, 300, 900}
 * 3 * 5 * 6 * 2 product of other array
 * elements except 10 is 180
 * 10 * 5 * 6 * 2 product of other array
 * elements except 3 is 600
 * 10 * 3 * 6 * 2 product of other array
 * elements except 5 is 360
 * 10 * 3 * 5 * 2 product of other array
 * elements except 6 is 300
 * 10 * 3 * 6 * 5 product of other array
 * elements except 2 is 900
 */

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5)
    var value = 1
    //index number
    var counter = 0

    for (i in 0 until arr.size) {
        for (j in 0 until arr.size) {
            if (j != counter) {
                value = value * arr[j]
            }
        }
        print("$value , ")
        value = 1
        counter++
    }
}
