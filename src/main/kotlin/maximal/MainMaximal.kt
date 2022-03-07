package maximal

fun main() {
    val n = readLine()!!.toInt()
    val input = readLine()!!.split(" ")
    val mas = LongArray(n)
    repeat(n) {
        mas[it] = input[it].toLong()
    }
    val prefMas = LongArray(n + 1)
    var max = mas[0]
    for (i in 1..n) {
        prefMas[i] = prefMas[i-1] + mas[i-1]
    }
    for (l in 1..n) {
        for (r in l..n) {
            if (prefMas[r] - prefMas[l-1] > max) max = prefMas[r] - prefMas[l-1]
        }
    }
    println(max)
}

