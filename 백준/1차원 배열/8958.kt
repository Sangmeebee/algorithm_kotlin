import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextLine().toInt()
    repeat(n) {
        val li = nextLine()
        var zeroCount = 0
        var result = 0
        for (element in li) {
            if (element == 'O') {
                zeroCount += 1
                result += zeroCount
            } else zeroCount = 0
        }
        println(result)
    }
}