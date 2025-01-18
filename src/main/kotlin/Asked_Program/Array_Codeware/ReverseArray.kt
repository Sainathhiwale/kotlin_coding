package Asked_Program.Array_Codeware

fun main(args:Array<String>){

    val num = arrayOf(1,2,3,4,5,6,7,8,9)
    val resultData = reversedData(num)
    println(resultData.joinToString(", "))

}
fun reversedData(num:Array<Int>):Array<Int>{

    return num.reversedArray()
}