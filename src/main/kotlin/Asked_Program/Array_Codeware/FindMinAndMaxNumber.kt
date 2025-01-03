package Asked_Program.Array_Codeware

fun main(args:Array<String>){
    val num = arrayOf(1,2,3,7,9,5,6,8,10)
    val resultData = findMinAndMax(num)
    println(resultData)

}
fun findMinAndMax(num:Array<Int>): Map<String,Int?>{
    val min = num.minOrNull()
    val max = num.maxOrNull()
    return mapOf("min" to min, "max" to max)
}