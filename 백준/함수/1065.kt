import java.util.*

fun hanNumber(n: Int): Boolean {
    return when (n) {
        in 1..99 -> true
        1000 -> false
        else -> {
            val arr = arrayOf(0, 0, 0)
            var temp = n
            var i = 0
            while (temp > 0) {
                arr[i] = temp % 10
                temp /= 10
                i++
            }
            arr[2] - arr[1] == arr[1] - arr[0]
        }
    }
}

fun main() {
    with(Scanner(System.`in`)) {
        val x = nextInt()
        var cnt = 0
        for (i in 1..x) {
            if (hanNumber(i)) cnt++
        }
        println(cnt)
    }
}