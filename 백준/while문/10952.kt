import java.util.*

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        val a = next().toInt()
        val b = next().toInt()
        if (a == 0 && b == 0) break
        println(a + b)
    }
}