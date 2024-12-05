package Asked_Program.Array_Codeware


fun main(args:Array<String>){
    val num = listOf(1, 2, 10, 8)
    val result = findTwoOldestAge(num)
    println(result)
    // second approach
    val data = findTwoOldestAges(num)
    println(data)
    // third approach
    val oldestAge = findtwoOldestArg(num)
    println(oldestAge)
}
fun findTwoOldestAge(args:List<Int>):List<Int>{
    return args.sorted().takeLast(2)
}
// second approach
fun findTwoOldestAges(args:List<Int>):List<Int> = args.sorted().reversed().slice(0..1).reversed()

fun findtwoOldestArg(args: List<Int>): List<Int?> {
    var max1 = args.maxOrNull()
    return listOf( args.filter { it!=max1 }.maxOrNull(),max1)
    //return listOfNotNull(max2,max1)
}