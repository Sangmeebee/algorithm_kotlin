fun s(n: Int): Int {
    if (n < 10) return n
    return s(n / 10) + n % 10
}

fun d(n: Int): Int {
    return n + s(n)
}

fun checkSelfNum(n: Int, temp: IntArray) {
    val v = d(n)
    if (v > 10000) return
    if (temp[v] == 1) return
    temp[v] = 1
    checkSelfNum(v, temp)
}

fun main() {
    val temp = IntArray(10001) { 0 }
    for (i in 1..10000) {
        checkSelfNum(i, temp)
    }
    for (i in 1..10000) {
        if (temp[i] == 0) {
            println(i)
        }
    }
}