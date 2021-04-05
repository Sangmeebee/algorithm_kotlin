import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val word = next().toUpperCase()
    var max = 0
    word.toSet().forEach { w ->
        val c = word.count { it == w }
        if (max < c) max = c

    }

    val li = mutableListOf<Char>()
    word.toSet().forEach { w ->
        val c = word.count { it == w }
        if (max == c) li.add(w)
    }
    if(li.size >1) println("?")
    else println(li[0])
}