
fun main(args: Array<String>){
    val str = "This is a test. This test is simple!"
    val checkResult = wordFrequency(str)
    println(checkResult)
}

fun wordFrequency(str: String): Map<String,Int> {
    val wordRegex = Regex("\\b\\w+\\b")
    return wordRegex.findAll(str.lowercase())
        .map { it.value }
        .groupingBy { it }
        .eachCount()
}
