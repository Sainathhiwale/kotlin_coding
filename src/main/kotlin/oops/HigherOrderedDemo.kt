package oops

class HigherOrderedDemo {

    fun getValue(num1:Int,num2:Int, operation:(Int,Int) ->Int):Int{
        return operation(num1, num2)
    }
}

fun main(args:Array<String>){

    val obj = HigherOrderedDemo()
    val sum = obj.getValue(10,10){a,b -> a+b}
    println("the sum of two number is: $sum")
    val multiple = obj.getValue(22,7){c,d -> c*d}
    println("multiple number count is: $multiple")
}