import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextLine().toDouble()
    val arr = nextLine()!!.split(" ").map { it.toDouble() }
    val maxN = arr.maxOrNull()
    var result = 0.0
    for (element in arr) {
        result += (element / maxN!! * 100)
    }
    println(result / n)
}