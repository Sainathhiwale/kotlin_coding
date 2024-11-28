package basic.functionsdemo

fun main(args:Array<String>){
    val mul = multiple(3,5)
    println(mul)
}

fun multiple(num1:Int,num2:Int):Int{
    return num1.times(num2)
}