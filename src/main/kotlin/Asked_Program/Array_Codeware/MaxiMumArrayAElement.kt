package Asked_Program.Array_Codeware

fun main(args:Array<String>){
    val result = findMax(arrayOf(1, 3, 5, 7, 2))
    println(result)
}

fun findMax(element: Array<Int>): Int? {
    return  element.maxOrNull()
}
