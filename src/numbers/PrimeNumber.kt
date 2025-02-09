import java.util.Scanner

/**
 * https://www.geeksforgeeks.org/java-prime-number-program/
 */

/**
 * A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * For example 2, 3, 5, 7, 11,….. are prime numbers.
 */

// Method 1:
fun isPrime(number: Int): Boolean {
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
fun main() {
    val number = 7
    if (isPrime(number)) {
        println("$number is prime")
    } else {
        println("$number is not prime")
    }
}

//Method 2
/*fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    val num = scanner.nextInt()

    var i = 2
    var isPrime = true

    while (i < num) {
        if (num % i == 0) {
            isPrime = false
            break
        }
        i++
    }

    if (isPrime) {
        println("$num is prime")
    } else {
        println("$num is not prime")
    }
}*/

