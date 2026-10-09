import kotlin.math.pow

fun main() {
    print("Введите x: ")
    val x = readln().toDouble()

    print("Введите n: ")
    val n = readln().toInt()

    var sum = 0.0

    for (i in 0..n) {
        val term = ((-1.0).pow(i) * (x - 1).pow(i + 1)) / (i + 1)
        sum += term
    }

    println("Результат: $sum")
}