fun main()
{
    try {
        println("Введите первое число:")
        var first = readln().toDouble()
        println("Введите второе число:")
        var second = readln().toDouble()
        when  {
            first > second -> first = first + 1
            second > first -> second = second + 1
            first == second -> first = Math.pow(first, 3.0)
        }
        println("$first $second")
    } catch (e:Exception)
    {
        println("не верный формат")
    }
}