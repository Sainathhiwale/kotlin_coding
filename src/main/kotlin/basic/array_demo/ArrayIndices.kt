package basic.array_demo

fun main(args: Array<String>){

    val number = arrayOf(9,2,3,4,5,6)
    for (i in number.indices){
        println(number[i])
    }
}