package iv

fun add(a:Int,b:Int):Int{
    return a+b
}
fun sub(num1:Int,num2:Int)= num1-num2

fun defadd(c:Int,d:Int=5):Int{
    return c*d
}
fun main(args:Array<String>){

    val result = add(10,10)
    println(result)
    val result2 = sub(20,30)
    println(result2)
    val result3 = defadd(c=5)
    println(result3)
}