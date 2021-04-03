import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n, x) = br.readLine().split(" ").map { it.toInt() }
    val li = br.readLine().split(" ").map { it.toInt() }.filter { it < x }
    for (element in li) {
        print("$element ")
    }
}