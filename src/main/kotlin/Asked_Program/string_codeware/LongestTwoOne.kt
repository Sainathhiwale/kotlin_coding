package Asked_Program.string_codeware

fun main(args:Array<String>){
    val str1 = "xyaabbbccccdefww"
    val str2 = "xxxxyyyyabklmopq"
    println(findTwoOneLongest(str1,str2))
    val c = "abcdefghijklmnopqrstuvwxyz"
    println(findTwoOneLongest(c, c))
}
fun findTwoOneLongest(str1:String,str2:String):String{
    return (str1+str1).toSet().sorted().joinToString("")
}