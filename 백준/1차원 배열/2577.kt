import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()
    val v = (a * b * c).toString().map { it.toString().toInt() }
    repeat(10) { index ->
        println(v.count { it == index })
    }
}