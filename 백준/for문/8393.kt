import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    var sumV = 0
    for (i in 1..n) {
        sumV += i
    }
    print(sumV)
}