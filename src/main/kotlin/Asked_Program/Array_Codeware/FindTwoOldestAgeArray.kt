package Asked_Program.Array_Codeware


fun main(args:Array<String>){
    val num = listOf(1, 2, 10, 8)
    val result = findTwoOldestAge(num)
    println(result)
}
fun findTwoOldestAge(args:List<Int>):List<Int>{
    return args.sorted().takeLast(2)
}