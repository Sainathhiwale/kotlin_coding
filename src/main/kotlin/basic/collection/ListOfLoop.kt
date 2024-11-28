package basic.collection

fun main(args:Array<String>){
    val name = listOf(1,2,3,4,5,"rahul","mahesh","ravi","sainath","kailas","kishor")
    var number = listOf<Number>()
    var namesOfList = listOf<String>()
    var emptyNumber = mutableListOf<Any>()
    for (list in name){
         number = name.filterIsInstance<Int>()
         namesOfList = name.filterIsInstance<String>()
    }

    println(number)
    println(namesOfList)
    emptyNumber.addAll(number)
    emptyNumber.addAll(namesOfList)
    println(emptyNumber)
}