import java.util.*

fun main() = with(Scanner(System.`in`)) {

    val n = nextInt()
    var res = 1
    for (i in 1..n) {
        res *= i
    }
    println(res)
}