package prefix

fun main() { // Почему медленно u_u
    var input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val q = input[1].toInt()
    val mas = readLine()!!.trim().split(" ").map { it.toLong() } // LONG *#@#*!
    val prefix = LongArray(mas.size + 1)
    for (i in 1..n) {
        prefix[i] = prefix[i-1] + mas[i-1]
    }
    var l = 0
    var r = 0
    repeat(q) {
        input = readLine()!!.split(" ")
        l = input[0].toInt() - 1
        r = input[1].toInt()
        println(prefix[r] - prefix[l])
    }
}

