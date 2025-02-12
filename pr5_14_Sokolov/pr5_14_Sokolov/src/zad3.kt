fun main()
{
 println("Введите ваш возраст:")
 try
 {
     val age = readLine()!!.toInt()
     val life = when {
         age in 0..2 -> "Младенец"
         age in 3..6 -> "Дошкольник"
         age in 7..12 -> "Школьник"
         age in 13..17 -> "Подросток"
         age in 18..64 -> "Взрослый"
         age in 65..150 -> "Пожилой"
         else -> "Некорректный возраст"
     }
     println("Стадия жизни для возраста $age: $life")
 }catch (e: Exception){
     println("Ошибка: ${e.message}")
 }
}