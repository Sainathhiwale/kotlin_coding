package Asked_Program

fun main(args:Array<String>){
    val str = "sainathhiwale"
    val resultData = findDuplicateChar(str)
    println(resultData)
}
fun findDuplicateChar(text:String):Map<Char,Int>{

   return text.groupingBy { it }.eachCount().filter { it.value>1 }
}