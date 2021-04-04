import java.util.*
import kotlin.math.round

fun main() = with(Scanner(System.`in`)) {
    val c = nextLine().toInt()
    repeat(c) {
        val li = nextLine().split(" ").map { it.toInt() }
        val n = li[0]
        val scores = li.slice(1 until li.size)
        val modelNum = scores.filter { it > scores.average() }.size.toDouble()
        println("%.3f".format(modelNum/n*100)+"%")
    }
}