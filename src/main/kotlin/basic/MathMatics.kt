package basic

fun main(args:Array<String>){
    val sum = sumOfNum(20,20)
    println(sum)
    val sub = subOfNum(10,9)
    println(sub)
    val div = divOfDiv(50,10)
    println(div)
}

fun sumOfNum(num1:Int, num2: Int):Int{
    return num1+num2
}
fun subOfNum(num1:Int, num2:Int):Int{
    return num1-num2
}
fun divOfDiv(num1:Int, num2:Int):Int{
    return  num1/num2;
}
