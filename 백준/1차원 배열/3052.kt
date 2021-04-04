import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val arr = arrayOfNulls<Int>(10)
    repeat(10) {
        val v = nextInt()
        arr[it] = v%42
    }
    println(arr.toSet().size)
}