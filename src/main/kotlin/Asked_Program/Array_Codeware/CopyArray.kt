package Asked_Program.Array_Codeware

fun main(args:Array<String>){
    val num = arrayOf(1,2,3,4,6,5,7)
    val resultData = reverseCopy(num)
    println(resultData)
}
fun reverseCopy(num:Array<Int>):Array<Int>{
    return Array(num.size){
        num[num.size-1-it]
    }
}


