package Asked_Program

fun main(args:Array<String>){
    val sentence = "This is a test. This test is simple!"
    val frequencies = wordFrequency(sentence)
    println(frequencies)

}
 fun wordFrequency(text:String):Map<String,Int>{

     return text.lowercase()
         .replace(Regex("[^a-z\\s]"), "")
         .split("\\s+".toRegex())
         .filter { it.isNotEmpty() }
         .groupingBy { it }.eachCount()
 }

/*Explanation:
lowercase():

Converts the sentence to lowercase to ensure "This" and "this" are treated as the same word.
replace(Regex("[^a-z\\s]"), ""):

Removes any non-alphabetic characters except spaces using a regular expression.
split("\\s+".toRegex()):

Splits the string into words using one or more whitespace characters as delimiters.
filter { it.isNotEmpty() }:

Removes any empty strings that might result from splitting.
groupingBy { it }.eachCount():

Groups the words and counts their occurrences.
Punctuation Handling:
The regular expression [^a-z\\s] ensures only alphabetic characters and spaces are kept.
*/