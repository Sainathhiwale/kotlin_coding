package Asked_Program.Array_Codeware

fun main(args:Array<String>){
    val num = listOf(2,4,5,6,7,8,1,3,2,5,4,6,7,8,2,1)
    val resultData = findDuplicateNumbers(num)
    println(resultData)
}
fun findDuplicateNumbers(num:List<Int>):Map<Int,Int>{
    return num.groupingBy { it }.eachCount().filter { it.value>1 }
}