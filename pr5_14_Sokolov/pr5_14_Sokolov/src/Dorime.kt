import kotlin.math.pow
import kotlin.math.sin

fun main() {
    println("Введите значение x:")
    try {
        val x = readLine()!!.toDouble()
        val result = when {
            x <= 3 -> x.pow(2) + 3 * x + 9
            x > 3 -> {
                val demon = x.pow(2) - 9
                if (demon != 0.0) {
                    sin(x) / demon
                } else {
                    "Ошибка: деление на ноль"
                }
            }
            else -> "Непредвиденное значение x"
        }
        println("F($x) = $result")
    } catch (e: Exception){
        println("Ошибка: {e.message}. Пожалуйста, введите числовое значние.")
    }
}