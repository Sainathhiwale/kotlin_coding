package Asked_Program.asked_random

fun main(args:Array<String>){
    val num:Int = 15
    println(findBizz(num))

}
fun findBizz(num:Int){
    for (i in 1..num){
        when{
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }

}