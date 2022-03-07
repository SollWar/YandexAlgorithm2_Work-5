package merge
//Слить две упорядоченные последовательности в одну

fun main() {
    val num1 = readLine()!!.trim().split(" ").map { it.toInt() }
    val num2 = readLine()!!.trim().split(" ").map { it.toInt() }
    val merged = MutableList<Int>(num1.size + num2.size) { 0 }
    var first1 = 0
    var first2 = 0

    for (i in 0..(num1.size + num2.size)) {
        if (first1 != num1.size && (first2 == num2.size || num1[first1] < num2[first2])) {
            merged[i] = num1[first1]
            first1++
        } else if (first2 != num2.size){
            merged[i] = num2[first2]
            first2++
        }
    }

    println(merged)
}