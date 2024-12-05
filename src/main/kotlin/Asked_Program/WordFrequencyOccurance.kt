package Asked_Program

fun main(args:Array<String>){
    val sentence = "This is a test. This test is simple!"
    val frequencies = wordFrequencys(sentence)
    println(frequencies)

}
fun wordFrequencys(text:String):Map<String,Int>{
    return text.split(Regex("\\W+"))
        .map { it.lowercase() }
        .filter { it.isNotBlank() }
        .groupingBy { it }
        .eachCount()
}

/*
* Explanation of Changes:
split(Regex("\\W+")):

Splits the sentence into words using a regular expression that matches any non-word characters (\W), including punctuation.
Automatically removes punctuation without requiring replace.
map { it.lowercase() }:

Converts each word to lowercase in one step.
filter { it.isNotBlank() }:

Ensures no empty or blank strings are included after splitting.

Advantages of This Approach:
Simpler Regular Expression:
\W+ handles punctuation and spaces more directly.
Streamlined Logic:
Reduces the need for multiple transformation steps like replace.
Both methods are efficient and produce the same result. You can choose based on which approach feels more intuitive to you!
* */