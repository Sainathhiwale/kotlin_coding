package oops


class HigherDemo {
    fun multiples(x:Int,y:Int):Int = x+y

    fun calculate(num1:Int, num2:Int, operation:(Int,Int)->Int):Int{

        return operation(num1,num2)
    }
}

fun main(args:Array<String>){

    val obj = HigherDemo()
    val sum = obj.calculate(10,10){a,b -> a*b}
    println(sum)
    println(obj.multiples(10,10 ))
}