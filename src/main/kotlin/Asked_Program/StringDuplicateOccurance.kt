package Asked_Program

fun main(args:Array<String>){
    val name = listOf("sainath","mahesh","ganesh","ravi","rahul","rakesh","sainath","mahesh","ganesh","ravi","rahul")
    val resultData = findDuplicateName(name)
    println(resultData)

}
fun findDuplicateName(name:List<String>):Map<String,Int>{
    val sortedName = name.sorted()
    return sortedName.groupingBy { it }.eachCount()
}