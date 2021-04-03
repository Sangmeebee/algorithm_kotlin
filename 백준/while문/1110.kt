import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    var newN = n
    var cnt = 0
    while (true) {
        cnt++
        val tenN = newN / 10
        val oneN = newN % 10
        newN = oneN * 10 + (oneN + tenN) % 10
        if (newN == n) break
    }
    print(cnt)
}