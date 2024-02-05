package numbers

import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/program-for-armstrong-numbers/
 */

/**
 * Input:153
 * Output: Yes
 * 153 is an Armstrong number.
 * 1*1*1 + 5*5*5 + 3*3*3 = 153
 */

/**
 * Input: 120
 * Output: No
 * 120 is not an Armstrong number.
 * 1*1*1 + 2*2*2 + 0*0*0 = 9
 */

fun main() {
    // var num: Int
    var rem: Int
    var cube: Int
    var sum = 0

    val scanner = Scanner(System.`in`)
    println("Enter the number: ")
    var num: Int = scanner.nextInt()
    val temp: Int = num

    while (num != 0) {
        rem = num % 10
        cube = rem * rem * rem
        sum += cube
        num /= 10
    }

    if (temp == sum) {
        println("$sum is an Armstrong number")
    } else {
        println("$sum is not an Armstrong number")
    }
}