import java.util.Scanner
fun main() = with(Scanner(System.`in`)){
    val year = nextInt()
    print(
        when{
            year%4==0 && (year%100!=0 || year%400 ==0) -> 1
            else -> 0
        }
    )
}