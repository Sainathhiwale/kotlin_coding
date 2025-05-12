package oops

class LambdaDemo {

    val message:(Int,Int) -> Int ={a,b -> a*b}
    fun add(num1:Int,num2:Int, operation:(Int,Int)-> Int):Int{
        return operation(num1,num2)
    }
}

fun main(args:Array<String>){
    val obj = LambdaDemo()
    println(obj.message(10,10))
    val addition = obj.add(25,19){a,b -> a*b}
    println(addition)
}