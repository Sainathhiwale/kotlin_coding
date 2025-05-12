package oops

class InfixDemo {
}

infix fun Int.greaterCheck(y:Int):Int{
    if (this>y)
        return this
    else
        return y
}
fun main(args:Array<String>){
    val x:Int=40
    val y:Int=20
    val max:Int = x greaterCheck y
    println(max)
}