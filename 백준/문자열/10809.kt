import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val alphas = Array(26) { -1 }
    val s = nextLine()
    for(i in s.indices){
        val index = s[i].toInt()-97
        if(alphas[index] == -1){
            alphas[index] = i
        }
    }
    alphas.forEach { print("$it ") }
}