import java.util.*

fun main() = with(Scanner(System.`in`)){
    var maxN = 0
    var maxI = -1
    repeat(9){
        val now = nextInt()
        if(now > maxN) {
            maxN = now
            maxI = it
        }
    }
    print("$maxN\n${maxI+1}")
}