package basic.array_demo

fun main(args:Array<String>){
    var num = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for (i in num.indices){
        println(i)
    }
}