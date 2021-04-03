import java.util.*

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        try {
            val a = next().toInt()
            val b = next().toInt()
            println(a + b)
        } catch (e: Exception) {
            break
        }
    }
}