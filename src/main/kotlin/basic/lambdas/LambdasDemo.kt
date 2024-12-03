package basic.lambdas

fun main(args:Array<String>){
    val sum = num(10,10)
    println(sum)
}
val num:(Int,Int)->Int= {a,b ->a+b}

