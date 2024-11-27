package basic

fun main(args:Array<String>){
    val num1 = 1000
    val num2 = 999
    var num3 = 1122
    val max1 = if (num1>num2) num1 else num2
    val max2 = if (num3>num2) num3 else num1
    println("max1 value is: $max1")
    println("max2 value is $max2")
}