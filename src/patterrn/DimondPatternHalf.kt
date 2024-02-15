package patterrn

/**
 * Print below diamond pattern
 *      *
 * 	   ***
 * 	  *****
 * 	 *******
 * 	**********
*/

fun main() {

    // outer loop for row
    for (i in 1..5) {
        // print right space
        for (sp in 5 - i downTo 1) {
            print(" ")
        }
        // calculate and print diamond
        for (j in 1..(2 * i - 1)) {
            print("*")
        }
        // print new line after every row
        println()
    }
}
