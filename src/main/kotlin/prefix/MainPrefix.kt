package prefix

fun main() {
    var input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val q = input[1].toInt()
    input = readLine()!!.split(" ")
    val mas = IntArray(n)
    repeat(n) {
        mas[it] = input[it].toInt()
    }
    val prefMas = IntArray(mas.size + 1)
    for (i in 1..mas.size) { // Заполняем префиксный массив
        prefMas[i] = prefMas[i - 1] + mas[i - 1]
    }

    repeat(q) {
        input = readLine()!!.split(" ")
        val l = input[0].toInt() - 1 // Надо так
        val r = input[1].toInt()

        println(prefMas[r] - prefMas[l])
    }
}

