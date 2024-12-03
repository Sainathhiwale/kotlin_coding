package basic.collection

fun main(args:Array<String>){
    val num = listOf(1,3,2,1,3,4,5,6,7,5,4,6)
    var result = findOccouranceNumber(num)
    println(result)
}
 fun findOccouranceNumber(num:List<Int>): Map<Int, Int> {
    //return num.groupingBy{it}.eachCount()  // showing  all number with occurrence
     return num.groupingBy { it }.eachCount().filter { it.value>1 } // showing only duplicate number occurrence
}