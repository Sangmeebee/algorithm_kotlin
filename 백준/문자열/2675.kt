import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader((System.`in`)))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(readLine())
    val t = st.nextToken().toInt()
    repeat(t) {
        st = StringTokenizer(readLine())
        val reNum = st.nextToken().toInt()
        val str = st.nextToken()
        str.forEach { word ->
            repeat(reNum) {
                bw.write(word.toString())
            }
        }
        bw.write("\n")
        bw.flush()
    }
    bw.close()
}