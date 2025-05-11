package iv

fun main(args:Array<String>){

    val num:Int = 10
    val num2:Float = 10.8f
    val name:String = "Sainath"
    val num3 = arrayOf(10,9,8,7,6,5,4,1,2,3)
    val num4 = listOf(2,3,4,5,6,7,8,9)
    val num5 = mutableListOf(4,5,6,7,8,9)

    println("int value is $num")
    println("float value is: $num2")
    println("name  value is $name")
    for (i in 0 until num3.size){
        println("array element is ${num3[i]}")
    }
    println("list element is $num4")
    println("mutablelistof element is $num5")


}