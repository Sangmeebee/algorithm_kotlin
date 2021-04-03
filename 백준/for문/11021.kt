import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val t = br.readLine().toInt()
    for (i in 1..t) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        println("Case #$i: ${a + b}")
    }
}