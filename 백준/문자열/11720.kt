import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val c = nextLine().toInt()
    val input = nextLine()
    var sum = 0
    input.forEach { sum+=it.toString().toInt() }

    println(sum)
}