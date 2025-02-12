fun main()
{
    try {
        println("Введите цифру от 0 до 9:")
        val digit = readLine()!!.toInt()
        val word = when (digit) {
            0 -> "Ноль"
            1 -> "Один"
            2 -> "Два"
            3 -> "Три"
            4 -> "Четрые"
            5 -> "Пять"
            6 -> "Шесть"
            7 -> "Семь"
            8 -> "Восемь"
            9 -> "Девять"
            else -> "Некорректоное значение"
        }
        println("Цифра $digit прописью: $word")
    }catch (e: Exception){
        println("Ошибка: ${e.message}")
    }
}