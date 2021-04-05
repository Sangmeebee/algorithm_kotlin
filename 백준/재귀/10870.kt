import java.util.*

fun fibo(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        fibo(n - 2) + fibo(n - 1)
    }
}

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    println(fibo(n))
}