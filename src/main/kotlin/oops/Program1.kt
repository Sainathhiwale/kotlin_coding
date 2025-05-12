package oops

class Program1 {


}

fun  main(args:Array<String>){

    var numbers = listOf(10,1,1,2,9,8,7,6,3,4,5,6,7,8,9,10)
    val result = findDuplicate(numbers)
    println(result)
}
fun findDuplicate(numbers:List<Int>):Map<Int,Int>{

    return numbers.groupingBy { it }.eachCount().filter { it.value>1 }
}