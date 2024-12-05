package Asked_Program

fun main(args:Array<String>){
    val str = "Sainathhiwale"
    val resultData = findVowel(str)
    println("number of vowel:${resultData.size}" )
    println(resultData)
}
fun findVowel(str:String):List<Char>{
   val vowelList = mutableListOf<Char>()
  val vowel = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
  for (char in str){
      if (char in vowel){
         vowelList.add(char)
      }
  }
    return vowelList
}