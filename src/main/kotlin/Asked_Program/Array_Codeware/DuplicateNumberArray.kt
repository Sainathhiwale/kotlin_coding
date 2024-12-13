package Asked_Program.Array_Codeware

fun main(args:Array<String>){

    val num = arrayOf(2,4,5,6,7,8,1,3,2,5,4,6,7,8,2,1)
    val resultData = findDuplicateNum(num)
    println(resultData)
}

fun findDuplicateNum(num:Array<Int>):List<Int>{
    return num.distinct().sorted()
}