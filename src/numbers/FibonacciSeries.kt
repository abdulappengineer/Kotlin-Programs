package numbers

import java.util.*

fun generateFibonacciSeries(num: Int) {
    var i = 1
    var a = 0
    var b = 1
    var sum: Int

    println("Fibonacci Series : ")

    while (i <= num) {
        print("$a ")
        sum = a + b
        a = b
        b = sum
        i++
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the number: ")
    val num = scanner.nextInt()
    generateFibonacciSeries(num)
}
