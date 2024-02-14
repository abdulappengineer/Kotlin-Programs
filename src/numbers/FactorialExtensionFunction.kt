package numbers

fun Int.factorial(): Int {
    return if (this <= 1) {
        1
    } else {
        this * (this - 1).factorial()
    }
}
fun main() {
    val n = 5
    val factorial = n.factorial()
    println("Factorial of $n is $factorial")
}
