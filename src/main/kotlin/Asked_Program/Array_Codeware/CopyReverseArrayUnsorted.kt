package Asked_Program.Array_Codeware

fun main(args:Array<String>){
    val num = arrayOf(10,8,9,7,6,1,2,3,4,5)
    val resultData = copyReverseSorted(num)
    println(resultData.joinToString(", "))
}
fun copyReverseSorted(num:Array<Int>): Array<Int> {
    var sortedElement = num.sorted();
    return Array(sortedElement.size){
        sortedElement[sortedElement.size-1-it]
    }
}