package Asked_Program

fun main(args:Array<String>){
    val charName = arrayOf('s','a','i','n','a','t','h','h','i','w','a','l','e')
    val resultData = findCharDuplicateOccurance(charName)
    println(resultData)
}

fun findCharDuplicateOccurance(charName: Array<Char>): Map<Char,Int> {
    val sortedCharName = charName.sorted()
    return sortedCharName.groupingBy { it }.eachCount()
}
