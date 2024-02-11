package numbers

import kotlin.random.Random

/**
 * https://www.geeksforgeeks.org/generating-random-numbers-in-java/
 */

fun main() {
    val random = Random

    repeat(10) {
        println(random.nextInt(50))
    }
}
