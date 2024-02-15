package patterrn

/**
 * Print below pattern
 *
 *      *
 * 	   **
 * 	  ***
 * 	 ****
 * 	******
 *
 */

// Method: 1
fun main() {
    for (i in 1..5) {
        // print spaces
        for (sp in 5 - i downTo 1) {
            print(" ")
        }

        // print stars
        for (j in 1..i) {
            print("*")
        }

        println()
    }
}

// Method: 2
/*fun main() {
    val n = 5
    for (i in 1 until n + 1) {
        for (j in n downTo 1) {
            if (i >= j) {
                //print *
                print("*")
            } else {
                // print space
                print(" ")
            }
        }
        // next line
        println()
    }
}*/
