package Asked_Program.string_codeware

fun main(args:Array<String>){
   var str1 = "xyaabbbccccdefww"
   var str2 = "xxxxyyyyabklmopq"
    val result = findTwoToOne(str1,str2)
    println(result)
    val data = findTwoOne(str1,str2)
    println(data)
}

fun findTwoToOne(str1:String,str2:String): List<String> {
    val finalStr = str1+str2
    return listOf(finalStr.toSortedSet().joinToString(""))
}

fun findTwoOne(str1:String,str2:String):String{
    return (str1+str2).toSortedSet().joinToString("")

}