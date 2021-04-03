import java.util.Scanner
fun main() = with(Scanner(System.`in`)){
    var h = nextInt()
    var m = nextInt()
    m -= 45
    if(m>=0) print("$h ${m}")
    else {
        m +=60
        h -= 1
        if(h >= 0) print("$h $m")
        else print("${h+24} $m")
    }
}