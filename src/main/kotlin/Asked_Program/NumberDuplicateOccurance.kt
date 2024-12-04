package Asked_Program

import com.sun.org.apache.xml.internal.security.Init

fun main(args:Array<String>){
    val num = listOf(1,4,7,2,5,3,4,6,1,5,2,6,3,7)
    val resultData = findDuplicateNumber(num)
    println(resultData)
}
fun findDuplicateNumber(num:List<Int>):Map<Int,Int>{
    val sortedNum = num.sorted()
    return  sortedNum.groupingBy { it }.eachCount().filter { it.value>1 }
}
/*sort the list before returning duplicate value
 using sorted() to do sorting like ascending
* */
