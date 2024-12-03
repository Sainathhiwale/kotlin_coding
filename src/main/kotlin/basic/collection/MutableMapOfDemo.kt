package basic.collection

fun main(args:Array<String>){

    val num = mutableMapOf<Int,Int>()
    num[1] =2
    num[2] =3
    num[3] =4
    num[4] =5
    num[5] =6
    println(num)
    for ((key,value)in num){
        println("key is: $key and valus is: $value")
    }
}